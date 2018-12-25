
import com.efun.pojo.Rate;
import com.efun.service.RateService;
import com.efun.util.GateRateUtils;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class PeopleServiceTest {
    private static final Logger logger = Logger.getLogger(PeopleServiceTest.class);
    @Autowired
    private RateService rateService;



//    @Test
//    public void testGetById() {
//        //测试查询对应的用户
//        People people = peopleService.getById(2);
//        System.out.println(people.toString());
//    }


    @Test
    public void getRateTest() throws Exception {
        //float rate = rateService.getRate("thds","TWD","USD");
        //System.out.println(rate);
    }

    @Test
    public void getTest() throws Exception{

        Rate rate = rateService.getRateFromList("thds", "TWD","USD1");
        System.out.println(rate.toString());
    }

}
