<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ include file="../../including.jsp"%>
<html>
<head>
	<meta content="width=device-width, initial-scale=1.0" name="viewport" />
	<link rel="stylesheet" type="text/css" href="media/css/bootstrap.min.css" />
	<link rel="stylesheet" type="text/css" href="media/css/bootstrap-responsive.min.css" />
	<link rel="stylesheet" type="text/css" href="media/css/font-awesome.min.css" />
	<link rel="stylesheet" type="text/css" href="media/css/style-metro.css" />
	<link rel="stylesheet" type="text/css" href="media/css/style.css" />
	<link rel="stylesheet" type="text/css" href="media/css/style-responsive.css" />
	<link rel="stylesheet" type="text/css" href="media/css/uniform.default.css" />
    <link rel="stylesheet" type="text/css" href="media/css/glyphicons.css" />
    <link rel="stylesheet" type="text/css" href="media/css/halflings.css" />
	<link rel="stylesheet" type="text/css" href="media/css/select2_metro.css" />
    <link rel="stylesheet" type="text/css" href="media/css/chosen.css" />
	<link rel="stylesheet" type="text/css" href="media/css/DT_bootstrap.css" />
	<link rel="stylesheet" type="text/css" href="media/css/jquery-ui-1.10.1.custom.min.css" />
	<link rel="shortcut icon" href="media/image/favicon.ico" />
	<style type="text/css">
		.bg{background-color: #ebf2f8 !important;}
	</style>
	<title>易幻後臺</title>
</head>
<body class="bg">
    <div class="row-fluid">
		<div class="span12">
			<h3 class="page-title">平台點管理<small>Point Manager</small></h3>
		</div>
	</div>
	<div class="row-fluid">
		<div class="span12">
			<form action="pointOperator_search.shtml" method="post" id="myfrom" class="form-vertical">
				<div class="portlet box ">
					<div class="portlet-title">
						<div class="row-fluid">
							<div class="span3">
								<div class="control-group">
									<div class="controls">
										<s:select name="area" cssClass="span9 select2_category" value="#request.area"
												  id="area" list="MAP_CORE_MASTER" listKey="key" listValue="value"/>
									</div>
								</div>
							</div>
							<div class="span3">
								<div class="control-group">
									<div class="controls">
	                                    <s:select name="gameCode" cssClass="span9 select2_category" id="searchGame"
	                                              list="{}" listKey="gameCode" listValue="gameName+'=='+content"
	                                              headerKey=""
	                                              data-placeholder="请选择游戏" title="请选择游戏" headerValue="">
	                                    </s:select>
									</div>
								</div>
							</div>
							<div class="span3">
								<div class="control-group">
									<div class="controls">
										<s:select name="stransactionType" cssClass="span9 select2_category" 
		         			  						          list="#{'':'全部',
		         			  						                  '11':'入点(储值)',
		         			  						                  '12':'入点(活动)',
		         			  						                  '13':'入点(申请)',
		         			  						                  '21':'出点(转游戏币)',
		         			  						                  '22':'出点(扣除)',
		         			  						                  '31':'点转移(点数转移)'}" 
		         			  						listKey="key" listValue="value" headerKey="" 
		         			  						data-placeholder="交易类型" title="交易类型" headerValue="">
		             					</s:select>
									</div>
								</div>
							</div>							
							<div class="span3">
								<div class="control-group">
									<div class="controls">
										<s:select name="sisSuccess" cssClass="span9 select2_category" 
	          			  						list="#{'':'全部','1':'交易成功','0':'交易失败'}" listKey="key" listValue="value" headerKey="" 
	          			  						data-placeholder="交易状态" title="交易状态" headerValue="">
	              						</s:select>
									</div>
								</div>
							</div>
							<div class="span3">
								<div class="control-group">
									<div class="controls">
										<s:select name="sisBackout" cssClass="span9 select2_category" 
	          			  						list="#{'':'全部','1':'撤销成功','0':'撤销失败'}" listKey="key" listValue="value" headerKey="" 
	          			  						data-placeholder="交易状态(撤销交易)" title="撤销交易状态(撤销交易)" headerValue="">
	              						</s:select>
									</div>
								</div>
							</div>
						</div>
						<div class="row-fluid">
							<div class="span3">
								<div class="control-group">
									<div class="controls">
										<input name="sstartTime" onFocus="WdatePicker({dateFmt:'yyyy-MM-dd',minDate:'#F{$dp.$D(\'endTime\',{d:-30})}'})" id="startTime" value="${sstartTime}" placeholder="交易开始时间" title="交易开始时间" type="text" class="m-wrap medium" value="${startTime}"/>
									</div>
								</div>
							</div>
							<div class="span3">
								<div class="control-group">
									<div class="controls">
										<input name="sendTime" onFocus="WdatePicker({dateFmt:'yyyy-MM-dd',maxDate:'#F{$dp.$D(\'startTime\',{d:30})}'})" id="endTime" type="text" class="m-wrap medium" placeholder="交易结束时间" title="交易结束时间" value="${sendTime}"/>
									</div>
								</div>
							</div>
							<div class="span3">
								<div class="control-group">
									<div class="controls">
										<s:textfield id="search_uid" placeholder="用户ID" title="用户ID" name="search_uid" cssClass="m-wrap medium"></s:textfield>
									</div>
								</div>
							</div>
							<div class="span3">
								<div class="control-group">
									<div class="controls">
										<s:textfield id="stransactionId" placeholder="交易ID" title="交易ID" name="stransactionId" cssClass="m-wrap medium"></s:textfield>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</form>
		</div>
	</div>
	
	<div class="row-fluid">
		<div class="span12">
			<div class="portlet box ">
				<div class="portlet-title">
					<div class="actions">
						<button type="button" class="btn green" name="search_btn" id="search_btn" value="搜索" onclick="searchW(this);"><i class="icon-search"></i>搜索</button>
                        <button type="button" class="btn purple" name="transfer_btn" id="transfer_btn" value="点转移" onclick="pointTransfer();"><i class="icon-random"></i>点转移</button>
                        <button type="button" class="btn red" name="deduct_btn" id="deduct_btn" value="扣点" onclick="deductWindows();"><i class="icon-minus"></i>扣点</button>
					    <button type="button" class="btn blue" name="export_btn" id="export_btn" value="导出" onClick="exportExcel();"><i class="icon-download"></i>导出</button>
                        <button type="button" class="btn yellow" name="help_btn" id="help_btn" value="帮助" onClick="window.open('help/custom/PointManager.pdf?v=1.0.0');"><i class="icon-question"></i>帮助</button>
					</div>
				</div>
				<div id="table_form" style="overflow: auto;" class="portlet-body"></div>
			</div>
		</div>
	</div>
	
	<div id="save_edit" class="modal hide fade" tabindex="-1" style="width:800px;">
		<div class="modal-header">
			<button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
			<h4><b>平台点转移</b></h4>&nbsp;&nbsp;*暂不支持免费点转移
		</div>
		<div class="modal-body" >
			<form id="editfrom" name="save" action="pointOperator_trans.shtml" method="POST">
				<input type="hidden" name="transactionType" value="31" id="transactionType">
				<input type="hidden" id="editArea_move" name="area" value="hk_tw">
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="bortable" id="edit_info">
					<tbody>						
						<tr>
							<td height="32">
								游戏：
							</td>
							<td>							
		                        <s:select name="gameCode" class="m-wrap chosen" id="addGameCode"
		                                  list="{}" listKey="gameCode" listValue="gameName" headerKey=""
		                                  data-placeholder="请选择游戏" title="请选择游戏" headerValue="">
		                        </s:select>
							</td>
							<td height="32">
								备注
							</td>
							<td>
								<input name="remark" id="remark" class="m-wrap" type="text" maxlength="50">
							</td>
						</tr>				
						<tr>
							<td height="32"></td>
							<td></td>
							<td height="32"></td>
							<td></td>
						</tr>
						 <tr>
							<td height="32" >
								转出账号(UID)：
							</td>
							<td>
							    <input name="useridOut" id="t_useridOut" class="m-wrap" type="text" maxlength="50">
							</td>
							<td height="32">
								-->转入账号(UID)：
							</td>
							<td>
								<input name="useridIn"  id="t_useridIn" class="m-wrap" type="text" maxlength="50">
							</td>
						</tr>
						<tr>
							<td height="32"></td>
							<td></td>
							<td height="32"></td>
							<td></td>
						</tr>
						<tr>
							<td height="32">
								平台点类型：
							</td>
							<td>
								<select name="platform" id="select_platform">
									<option value="point" selected>平台點</option>
								</select>
							</td>
							<td height="32">
								点数：
							</td>
							<td>
								<input name="point"  id="tranPoint"  class="m-wrap" type="text" maxlength="50">
							</td>
						</tr>
						<tr>
							<td height="200"></td>
							<td></td>
							<td></td>
							<td></td>
						</tr>
					</tbody>
				</table>
			</form>
		</div>
		<div class="modal-footer">
		   <a id="pointTransMsg"></a>
			<button type="button" data-dismiss="modal" class="btn">取消</button>
			<button name="btn" value="保存" id="save_data" onclick="saveInfo();" class="btn blue">确认</button>
		</div>
	</div>
	
	<div id="deduct_edit" class="modal hide fade" tabindex="-1" style="width:800px;">
		<div class="modal-header">
			<button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
			<h4><b>扣除平台点</b></h4>
		</div>
		<div class="modal-body" >
			<form id="editfrom2" name="save" action="pointOperator_deductPoint.shtml" method="POST">
				<input type="hidden" id="editArea" name="area" value="hk_tw" >
				<input type="hidden" name="transactionType" value="22" id="transactionType">
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="bortable" id="edit_info">
					<tbody>						
						<tr>
							<td height="32">
								游戏：
							</td>
							<td>							
		                        <s:select name="gameCode" class="m-wrap chosen" id="deductGameCode"
		                                  list="{}" listKey="gameCode" listValue="gameName" headerKey=""
		                                  data-placeholder="请选择游戏" title="请选择游戏" headerValue="">
		                        </s:select>
							</td>
							<td height="32">
								备注
							</td>
							<td>
								<input name="remark" id="remark" class="m-wrap" type="text" maxlength="50">
							</td>
						</tr>				
						<tr>
							<td height="32"></td>
							<td></td>
							<td height="32"></td>
							<td></td>
						</tr>
					 	<tr>
							<td height="32" >
								账号(UID)：
							</td>
							<td>
							    <input name="useridOut" id="t_useridOut"   class="m-wrap" type="text" maxlength="50">
							</td>
						</tr>
						<tr>
							<td height="32"></td>
							<td></td>
							<td height="32"></td>
							<td></td>
						</tr>
						<tr>
						 	<td height="32">
								平台点类型：
							</td>
							<td>
								<select name="platform" id="select_platform">
									<option value="point" selected>平台點</option>
								</select>
								*暂不支持免费点扣除
							</td>
							<td height="32">
								点数：
							</td>
							<td>
								<input name="point"  id="tranPoint"  class="m-wrap" type="text" maxlength="50">
							</td>
						</tr>
						<tr>
							<td height="200"></td>
							<td></td>
							<td></td>
							<td></td>
						</tr>
					</tbody>
				</table>
			</form>
		</div>
		<div class="modal-footer">
		    <a id="pointTransMsg"></a>
			<button type="button" data-dismiss="modal" class="btn">取消</button>
			<button name="btn" value="保存" id="save_data" onclick="pointDeduct();" class="btn blue">确认</button>
		</div>
	</div>
	
	<script type="text/javascript" src="media/js/jquery-1.10.1.min.js"></script>
	<script type="text/javascript" src="media/js/jquery-migrate-1.2.1.min.js"></script>
	<script type="text/javascript" src="media/js/bootstrap.min.js?v=20170908"></script>
	<script type="text/javascript" src="media/js/jquery.uniform.min.js"></script>
	<script type="text/javascript" src="media/js/select2.min.js"></script>
	<script type="text/javascript" src="media/js/app.js?v=20180108"></script>
	<script type="text/javascript" src="media/js/chosen.jquery.min.js"></script>
	<script type="text/javascript" src="js/calendar/WdatePicker.js"></script> 
	<script type="text/javascript" src="js/common-query-1.14.1.js?v=20180903"></script>
	<script type="text/javascript" src="js/sevform.js"></script>
	<script>
		jQuery(document).ready(function() {       
		    App.init();
		   
	        $('.select2_category').select2({
	            placeholder: "Select an option",
	            allowClear: true
	        });
           
            $("#area").LoadGameByArea({
           		gameId:'searchGame,addGameCode,deductGameCode',
           		gameType: {
           			isGame : "nolimit",
					isOnline : "nolimit"
           		}
            });
		});
		
		function searchW(obj){
			AppQuery.query({
				url:'pointOperator_search.shtml',
				button : obj
			});
		}
		
		function addInfo() {
			$("#editfrom")[0].reset();
			$('#save_edit').modal();
		}
		
		function saveInfo(){
			$("#save_data").attr("disabled",true);
			$("#editArea_move").val($("#area").val());
			AppQuery.save({
				from : 'editfrom',
				callback : function(text) {
	                if(text.code==1000){
	                	$("body").customalert(text.message,{type:'s'});
						searchW($("#search_btn"));
						$('#save_edit').modal("hide");
	                }else{
	                	$("body").customalert(text.message,{type:'f'});
						searchW($("#search_btn"));
						$('#save_edit').modal("hide");
	                }			
	                $("#save_data").attr("disabled",false);
				}
			});
		}
		
		function deductWindows() {
			$("#editfrom2")[0].reset();
			$('#deduct_edit').modal();
		}
		
		function pointDeduct(){
			$("#deduct_edit").attr("disabled",true);
			$("#editArea").val($("#area").val());
			AppQuery.save({
				from : 'editfrom2',
				callback : function(text) {
	                if(text.code==1000){
	                	$("body").customalert(text.message,{type:'s'});
						searchW($("#search_btn"));
						$('#deduct_edit').modal("hide");
	                }else{
	                	$("body").customalert(text.message,{type:'f'});
						searchW($("#search_btn"));
						$('#deduct_edit').modal("hide");
	                }	
	                $("#save_data").attr("disabled",false);
				}
			});
		}
		
		function pointTransfer() {
			$("#editfrom")[0].reset();
			$('#save_edit').modal();
		}
		
		function pointTransfer2() {
			var $this = getSingleDeleteId();
			if(!!!$this) return;
			$("#editfrom")[0].reset();
			
			AppQuery.modify({
				getJson:eval("("+$this.attr("this")+")")
			})
			$("#save_edit").modal();
		}
		
		function helpReal() {
			$("#save_edit").modal();
		}
		
		function modify() {
			var $this = getSingleDeleteId();
			if(!!!$this) return;
			$("#editfrom")[0].reset();
			
			AppQuery.modify({
				getJson:eval("("+$this.attr("this")+")")
			})
			$("#save_edit").modal();
		}
		
		//补单
		function dealReal() {
			var str = getSingleDeleteId();
			if(!!!str)return;
			
			if(confirm("确定补单？编号:"+str)) {
				AppQuery.deletes({
					url : "iosReissue_supplyFunction.shtml?ids="+str+"&area="+$("#area").val(),
					load : function(result) {
					    var code=result.code;
					    var supplyCode=result.supplyCode;
					    var message=result.message;
					    
						$("body").customalert("编号:"+str+"       处理状态:"+code+","+message,{type:'f'});
						PageApp.reloadChildPage();
					}
				});
			}
		}
		
		//重置結果
		function resetResultReal() {
			var str = getSingleDeleteId();
			if(!!!str)return;
			
			var pwd=prompt("请输入重置密碼","");
			if(pwd!="efun"){
                alert("密码有误");
                return;
            }
			
			if(confirm("确定重置结果？编号:"+str)) {
				AppQuery.deletes({
					url : "iosReissue_resetReissue.shtml?ids="+str+"&area="+$("#area").val(),
					load : function(result) {
					    var code=result.code;
					    var supplyCode=result.supplyCode;
					    var message=result.message;
					    
						$("body").customalert(code+"  "+message,{type:'f'});
						PageApp.reloadChildPage();
					}
				});
			}
		}
		
		//删除
		function checkReal() {
			var str = getSingleDeleteId();
			if(!!!str)return;
			alert(str);
			AppQuery.deletes({
				url : "iosReissue_supplyFunction.shtml?ids="+str+"&area="+$("#area").val(),
				load : function(result) {
					if(result>0) {
						$("body").customalert("删除成功！",{type:'s'});
						searchW($("#search_btn"));return;
					}
					$("body").customalert("删除失败！");
				}
			});
		}
			
	    function checkTrans(){
	    	var userIdOut=$("#t_useridOut").val();
	    	var userIdIn=$("#t_useridIn").val();
	     }
		
		//获取需要删除的ID
		function getDeleteIds() {
			var obj = $("input[name=boxs]:checked");
			if(obj.length==0) {
				$("body").customalert("请选择需要操作的数据");return null;
			}
			
			var str = "";
			obj.each(function(){
				str += "," + $(this).val();
			});
			str = str!=""?str.substring(1):str;
			
			return str;
		}
		
		//获取单条数据的id
		function getSingleDeleteId() {
			var obj = $("input[name=boxs]:checked");
			if(obj.length==0) {
				$("body").customalert("请选择需要操作的数据");return null;
			}
			
			var str = "";
			obj.each(function(){
				str += "," + $(this).val();
			});
			str = str!=""?str.substring(1):str;
			
			if(str.indexOf(",")>-1){
				$("body").customalert("只能操作一条数据");return null;
				return;
			}
			return str;
		}
		
		//获取单条数据的id
		function getSingleSelectObj() {
			var obj = $("input[name=boxs]:checked");
			if(obj.length>1) {
				$("body").customalert("只能操作一条数据");return null;
			}
			if(obj.length==0) {
				$("body").customalert("请选择需要操作的数据");return null;
			}
			
			return obj;
		}
			
		//导出到excel	
		function exportExcel(){
			$("#myfrom").ajaxFormUnbind();
			$("#myfrom").attr("action","pointOperator_exportExcel.shtml").submit();//提交
		}
	</script>
</body>
</html>