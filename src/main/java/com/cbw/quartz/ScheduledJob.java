/**
 * 
 */
package com.cbw.quartz;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**   
* @Title: ScheduledJob.java 
* @Package com.cbw.quartz 
* @Description: TODO(用一句话描述该文件做什么) 
* @author cbw   
* @date 2017年11月24日 下午2:22:36 
* @version V1.0   
*/
public class ScheduledJob implements Job{
	
	
	private SimpleDateFormat dateFormat() {
        return new SimpleDateFormat("HH:mm:ss");
    } 
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException { 
        System.out.println("--5s--: The time is now " + dateFormat().format(new Date())); 
    }

}
