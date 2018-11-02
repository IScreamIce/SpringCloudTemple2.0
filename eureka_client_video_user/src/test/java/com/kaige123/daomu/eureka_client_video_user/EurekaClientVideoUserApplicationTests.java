package com.kaige123.daomu.eureka_client_video_user;

import com.kaige123.daomu.eureka_client_video_user.DAO.Mapper.BannerMapper;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EurekaClientVideoUserApplicationTests {

    @Autowired
    DataSource dataSource;
    @Autowired
    BannerMapper bannerMapper;

    Logger logger = Logger.getLogger(EurekaClientVideoUserApplicationTests.class);

    @Test
    public void contextLoads() {
        logger.info("dataSource= "+dataSource);
        logger.info("bannerMapper= "+bannerMapper.getClass().getName());
    }

}
