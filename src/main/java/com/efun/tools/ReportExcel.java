package com.efun.tools;

import jxl.Workbook;
import jxl.format.Border;
import jxl.format.BorderLineStyle;
import jxl.format.Colour;
import jxl.format.UnderlineStyle;
import jxl.write.*;
import jxl.write.biff.RowsExceededException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.*;
import java.lang.Boolean;

public final class ReportExcel {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public final static void reportExcel(HttpServletRequest request, HttpServletResponse response, String filename,
			String tmptitle, String[][] dataTitles, List<Map<String, Object>> list) {

		if ((null == list || list.size() == 0) && null == dataTitles) {
			try {
				reportExcel(request, response, filename, tmptitle, new String[] { "" }, new ArrayList<Object[]>());
			} catch (Exception e) {
				e.printStackTrace();
			}
			return;
		}

		/**
		 * 获取标题部分
		 */
		String[] titleName = {};// excel标题名
		String[] titlekey = {};// 标题的key值
		if (null == dataTitles) {
			Map m = list.get(0);
			Iterator<String> it = m.entrySet().iterator();
			while (it.hasNext()) {
				titlekey = Arrays.copyOf(titlekey, titlekey.length + 1);
				String key = it.next();
				titlekey[titlekey.length - 1] = key;

				titleName = titlekey;
			}
		} else {
			int titleSize = dataTitles.length;
			for (int i = 0; i < titleSize; i++) {
				titlekey = Arrays.copyOf(titlekey, titlekey.length + 1);
				titlekey[titlekey.length - 1] = dataTitles[i][0];

				titleName = Arrays.copyOf(titleName, titleName.length + 1);
				titleName[titleName.length - 1] = dataTitles[i][1];
			}
		}

		/**
		 * 获取数据部分
		 */
		List<Object[]> newlist = new ArrayList<Object[]>();

		int listSize = list.size();
		int titleKeyLength = titlekey.length;

		for (int i = 0; i < listSize; i++) {
			Map<String, Object> m = list.get(i);

			Object[] objs = new Object[titleKeyLength];
			for (int j = 0; j < titlekey.length; j++) {
				objs[j] = m.get(titlekey[j]);
			}
			newlist.add(objs);
		}

		try {
			reportExcel(request, response, filename, tmptitle, titleName, newlist);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 生成 exsel 工具類
	 * 
	 * @param request
	 * @param response
	 * @param filename
	 *            文件名
	 * @param tmptitle
	 *            sheet子页名
	 * @param dataTitles
	 *            标题行
	 * @param list
	 *            数据内容List<Object[]>
	 * @throws IOException
	 * @throws WriteException
	 * @author xiaopan 2012-12-18
	 */

	@SuppressWarnings("rawtypes")
	public final static void reportExcel(HttpServletRequest request, HttpServletResponse response, String filename,
			String tmptitle, String[] dataTitles, List list) throws IOException, WriteException {

		response.setContentType("application/msexcel");
		response.setHeader("Content-Disposition",
				"attachment; filename=" + URLEncoder.encode(filename + ".xls", "utf-8"));
		OutputStream os = response.getOutputStream();
		WritableWorkbook wbook = null;
		WritableSheet wsheet = null;
		wbook = Workbook.createWorkbook(os);

		int k = 0;
		int row = 0;
		WritableFont wfont = new WritableFont(WritableFont.createFont("宋体"), 10, WritableFont.NO_BOLD, false,
				UnderlineStyle.NO_UNDERLINE, Colour.BLACK);
		WritableCellFormat wcfFC = new WritableCellFormat(wfont);
		try {
			wcfFC.setBorder(Border.NONE, BorderLineStyle.NONE);
		} catch (WriteException e) {

			e.printStackTrace();
		}
		Label label;

		if (list != null && list.size() > 0) {

			for (int i = 0; i < list.size(); i++) {

				if (i % 50000 == 0) {

					wbook.createSheet(tmptitle + k, k);
					wsheet = wbook.getSheet(k);
					k++;
					mergeCellsAndInsertData(wsheet, 3, 0, 8, 0, tmptitle, wcfFC);
					if(dataTitles != null){
						for (int m = 0; m < dataTitles.length; m++) {

							label = new Label(m, 1, dataTitles[m], wcfFC);// 生成工作表标题

							try {
								wsheet.addCell(label);
							} catch (RowsExceededException e) {

								e.printStackTrace();
							} catch (WriteException e) {

								e.printStackTrace();
							}
						}
					}

				}

				row = i % 50000;

				Object[] ob = (Object[]) list.get(i);

				for (int l = 0; l < ob.length; l++) {

					insertOne(wsheet, l, row + 2, ob[l] == null ? "" : ob[l].toString(), wcfFC);

				}

			}

			wbook.write();
			wbook.close();
			os.close();
			return;
		}

		return;
	}

	public final static void reportExcelWithBlank(HttpServletRequest request, HttpServletResponse response,
			String filename, String tmptitle, String[] dataTitles, List<?> list) throws IOException, WriteException {
		filename = filename + ".xls";
		filename = new String(filename.getBytes("UTF-8"), "ISO8859-1");

		response.setContentType("application/msexcel");
		response.setHeader("Content-Disposition", "attachment; filename=" + filename);
		OutputStream os = response.getOutputStream();
		WritableWorkbook wbook = null;
		WritableSheet wsheet = null;
		wbook = Workbook.createWorkbook(os);

		int k = 0;
		int row = 0;
		WritableFont wfont = new WritableFont(WritableFont.createFont("宋体"), 10, WritableFont.NO_BOLD, false,
				UnderlineStyle.NO_UNDERLINE, Colour.BLACK);
		WritableCellFormat wcfFC = new WritableCellFormat(wfont);
		try {
			wcfFC.setBorder(Border.NONE, BorderLineStyle.NONE);
		} catch (WriteException e) {

			e.printStackTrace();
		}
		Label label;

		if (list != null && list.size() > 0) {

			for (int i = 0; i < list.size(); i++) {

				if (i % 50000 == 0) {

					wbook.createSheet(tmptitle + k, k);
					wsheet = wbook.getSheet(k);
					k++;
					mergeCellsAndInsertData(wsheet, 3, 0, 8, 0, tmptitle, wcfFC);
					for (int m = 0; m < dataTitles.length; m++) {

						label = new Label(m, 1, dataTitles[m], wcfFC);// 生成工作表标题

						try {
							wsheet.addCell(label);
						} catch (RowsExceededException e) {

							e.printStackTrace();
						} catch (WriteException e) {

							e.printStackTrace();
						}
					}

				}

				row = i % 50000;

				Object[] ob = (Object[]) list.get(i);

				for (int l = 0; l < ob.length; l++) {

					insertOne(wsheet, l, row + 2, ob[l] == null ? "" : ob[l].toString(), wcfFC);

				}

			}

			wbook.write();
			wbook.close();
			os.close();
			return;
		}

		return;
	}

	/**
	 * 生成 exsel 工具類
	 *
	 * @param os
	 * @param dataTitles
	 *            标题行
	 * @param list
	 *            数据内容List<Object[]>
	 * @throws IOException
	 * @throws WriteException
	 * @author xiaopan 2012-12-18
	 */
	public final static void reportExcel(OutputStream os, String[] dataTitles, List<Object[]> list) throws Exception {
		WritableWorkbook wbook = null;

		try {
			wbook = Workbook.createWorkbook(os);

			WritableFont wfont = new WritableFont(WritableFont.createFont("宋体"), 20, WritableFont.BOLD, false,
					UnderlineStyle.NO_UNDERLINE, Colour.BLACK);

			WritableCellFormat wcfFC = new WritableCellFormat(wfont);

			wfont = new WritableFont(WritableFont.createFont("宋体"), 10, WritableFont.NO_BOLD, false,
					UnderlineStyle.NO_UNDERLINE, Colour.BLACK);
			wcfFC = new WritableCellFormat(wfont);
			try {
				wcfFC.setBorder(Border.NONE, BorderLineStyle.NONE);
			} catch (WriteException e) {

				e.printStackTrace();
			}
			Label label;

			wbook.createSheet("Sheet1", 0);
			WritableSheet wsheet = wbook.getSheet(0);
			for (int m = 0; m < dataTitles.length; m++) {
				label = new Label(m, 0, dataTitles[m], wcfFC);// 生成工作表标题

				try {
					wsheet.addCell(label);
				} catch (RowsExceededException e) {
					e.printStackTrace();
				} catch (WriteException e) {
					e.printStackTrace();
				}
			}

			if (list != null && list.size() > 0) {
				for (int i = 0; i < list.size(); i++) {
					Object[] ob = list.get(i);
					for (int l = 0; l < ob.length; l++) {
						insertOne(wsheet, l, i + 1, ob[l] == null ? "" : ob[l].toString(), wcfFC);
					}
				}

				wbook.write();
				wbook.close();
				os.close();
			}
		} finally {
			if (wbook != null) {
				try {
					wbook.close();
				} catch (Exception e) {
				}
			}

			try {
				os.close();
			} catch (Exception e) {
			}
		}

		return;
	}

	/**
	 * 生成 exsel 工具類
	 *
	 * @param response
	 * @param filename
	 * @param tmptitle
	 * @param dataTitles
	 * @param lists
	 * @throws IOException
	 * @throws WriteException
	 */
	@SuppressWarnings("rawtypes")
	public final static void reportExcel(HttpServletResponse response, String filename, String[] tmptitle,
			String[] dataTitles, List<List> lists) throws IOException, WriteException {

		response.setContentType("application/msexcel");
		response.setHeader("Content-Disposition",
				"attachment; filename=" + URLEncoder.encode(filename + ".xls", "utf-8"));
		OutputStream os = response.getOutputStream();
		WritableSheet wsheet = null;
		WritableWorkbook wbook = Workbook.createWorkbook(os);

		int k = 0;
		int row = 0;
		WritableFont wfont = new WritableFont(WritableFont.createFont("宋体"), 10, WritableFont.NO_BOLD, false,
				UnderlineStyle.NO_UNDERLINE, Colour.BLACK);
		WritableCellFormat wcfFC = new WritableCellFormat(wfont);
		try {
			wcfFC.setBorder(Border.NONE, BorderLineStyle.NONE);
		} catch (WriteException e) {

			e.printStackTrace();
		}
		Label label;

		String mytmptitle = "";
		for (int n = 0; n < lists.size(); n++) {
			List<?> list = lists.get(n);
			mytmptitle = tmptitle[n];

			if (list != null && list.size() > 0) {
				int j = 0;
				for (int i = 0; i < list.size(); i++) {

					if (i % 65535 == 0) {

						if (list.size() <= 65535 && j == 0) {
							wbook.createSheet(mytmptitle, k);
						} else {
							wbook.createSheet(mytmptitle + j, k);
						}

						wsheet = wbook.getSheet(k);
						k++;
						j++;
						for (int m = 0; m < dataTitles.length; m++) {

							label = new Label(m, 0, dataTitles[m], wcfFC);// 生成工作表标题

							try {
								wsheet.addCell(label);
							} catch (RowsExceededException e) {

								e.printStackTrace();
							} catch (WriteException e) {

								e.printStackTrace();
							}
						}

					}

					row = i % 65535;

					Object[] ob = (Object[]) list.get(i);

					for (int l = 0; l < ob.length; l++) {

						insertOne(wsheet, l, row + 1, ob[l] == null ? "" : ob[l].toString(), wcfFC);

					}

				}

			}
		}
		wbook.write();

		wbook.close();
		os.close();
		return;
	}

	/**
	 * 合并单元格，并插入数据
	 *
	 * @param sheet
	 *            工作表
	 * @param col_start
	 *            开始列
	 * @param row_start
	 *            开始行
	 * @param col_end
	 *            停止列
	 * @param row_end
	 *            停止行
	 * @param data
	 *            插入数据
	 * @param format
	 *            风格
	 */
	private final static void mergeCellsAndInsertData(WritableSheet sheet, Integer col_start, Integer row_start,
			Integer col_end, Integer row_end, Object data, WritableCellFormat format) {
		try {
			sheet.mergeCells(col_start, row_start, col_end, row_end);// 左上角到右下角
			insertOneCellData(sheet, col_start, row_start, data, format);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * 简单插入单元格
	 *
	 * @param sheet
	 *            工作表
	 * @param col
	 *            列
	 * @param row
	 *            行
	 * @param date
	 *            数据
	 * @param form
	 *            风格
	 */

	private final static void insertOne(WritableSheet sheet, Integer col, Integer row, String date,
			WritableCellFormat form) {
		try {
			Label label = new Label(col, row, date, form);
			sheet.addCell(label);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 插入单元格数据
	 *
	 * @param sheet
	 *            工作表
	 * @param col
	 *            列号
	 * @param row
	 *            行号
	 * @param data
	 *            数据
	 */
	private final static void insertOneCellData(WritableSheet sheet, Integer col, Integer row, Object data,
			WritableCellFormat format) {
		try {
			if (data instanceof Double) {

				jxl.write.Number labelNF = new jxl.write.Number(col, row, (Double) data, format);
				sheet.addCell(labelNF);
			} else if (data instanceof Boolean) {
				jxl.write.Boolean labelB = new jxl.write.Boolean(col, row, (Boolean) data, format);
				sheet.addCell(labelB);
			} else if (data instanceof Date) {
				jxl.write.DateTime labelDT = new jxl.write.DateTime(col, row, (Date) data, format);
				sheet.addCell(labelDT);
				setCellComments(labelDT, "这是个创建表的日期说明！");
			} else {
				Label label = new Label(col, row, data.toString(), format);
				sheet.addCell(label);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * 给单元格加注释
	 *
	 * @param label
	 *            单元格
	 * @param comments
	 *            注释内容
	 */
	private final static void setCellComments(Object label, String comments) {
		WritableCellFeatures cellFeatures = new WritableCellFeatures();
		cellFeatures.setComment(comments); // 设置注释说明
		if (label instanceof jxl.write.Number) {
			jxl.write.Number num = (jxl.write.Number) label;
			num.setCellFeatures(cellFeatures);
		} else if (label instanceof jxl.write.Boolean) {
			jxl.write.Boolean bool = (jxl.write.Boolean) label;
			bool.setCellFeatures(cellFeatures);
		} else if (label instanceof jxl.write.DateTime) {
			jxl.write.DateTime dt = (jxl.write.DateTime) label;
			dt.setCellFeatures(cellFeatures);
		} else {
			Label _label = (Label) label;
			_label.setCellFeatures(cellFeatures);
		}
	}

	public static void report(OutputStream os, String tmptitle, String[] dataTitles, List<?> list)
			throws IOException, WriteException {
		WritableSheet wsheet = null;
		WritableWorkbook wbook = Workbook.createWorkbook(os);

		int k = 0;
		int row = 0;
		WritableFont wfont = new WritableFont(WritableFont.createFont("宋体"), 10, WritableFont.NO_BOLD, false,
				UnderlineStyle.NO_UNDERLINE, Colour.BLACK);
		WritableCellFormat wcfFC = new WritableCellFormat(wfont);
		try {
			wcfFC.setBorder(Border.NONE, BorderLineStyle.NONE);
		} catch (WriteException e) {

			e.printStackTrace();
		}
		Label label;

		if (list != null && list.size() > 0) {

			for (int i = 0; i < list.size(); i++) {

				if (i % 50000 == 0) {

					wbook.createSheet(tmptitle + k, k);
					wsheet = wbook.getSheet(k);
					k++;
					mergeCellsAndInsertData(wsheet, 3, 0, 8, 0, tmptitle, wcfFC);
					for (int m = 0; m < dataTitles.length; m++) {

						label = new Label(m, 1, dataTitles[m], wcfFC);// 生成工作表标题

						try {
							wsheet.addCell(label);
						} catch (RowsExceededException e) {

							e.printStackTrace();
						} catch (WriteException e) {

							e.printStackTrace();
						}
					}

				}

				row = i % 50000;

				Object[] ob = (Object[]) list.get(i);

				for (int l = 0; l < ob.length; l++) {

					insertOne(wsheet, l, row + 2, ob[l] == null ? "" : ob[l].toString(), wcfFC);

				}

			}

			wbook.write();
			wbook.close();
			os.close();
			return;
		}

		return;
	}

}
