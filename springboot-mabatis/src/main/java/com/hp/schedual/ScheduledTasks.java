package com.hp.schedual;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 定时任务实现类
 * @author ck
 * @date 2018年5月23日 下午2:27:20
 */
@Component
public class ScheduledTasks {
	
	private final static Logger LOGGER = LoggerFactory.getLogger(ScheduledTasks.class);
	
	private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
	
	@Scheduled(initialDelay = 20000, fixedRate = 10000)
	public void reportCurrentTime(){
		LOGGER.info("时间：{}",DATE_FORMAT.format(new Date()));
	}
}
