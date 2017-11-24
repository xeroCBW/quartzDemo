/**
 * 
 */
package com.cbw.quartz;

import org.quartz.SchedulerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

/**   
* @Title: SchedulerListener.java 
* @Package com.cbw.quartz 
* @Description: listener类,用来监听
* @author cbw   
* @date 2017年11月24日 下午2:16:22 
* @version V1.0   
*/
@Configuration
public class SchedulerListener implements ApplicationListener<ContextRefreshedEvent> {	
	  @Autowired
	   public MyScheduler myScheduler;

	/* (non-Javadoc)
	 * @see org.springframework.context.ApplicationListener#onApplicationEvent(org.springframework.context.ApplicationEvent)
	 */
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		
		
		try { 
            myScheduler.scheduleJobs(); 
        } catch (SchedulerException e) { 
            e.printStackTrace(); 
        }
	}
	
	@Bean
    public SchedulerFactoryBean schedulerFactoryBean(){
        SchedulerFactoryBean schedulerFactoryBean = new SchedulerFactoryBean(); 
        return schedulerFactoryBean; 
    }

}
