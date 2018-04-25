package com.simulation.demo.services.schedule.service;

import java.util.Date;

import com.simulation.demo.domain.League;
import com.simulation.demo.domain.Schedule;

public interface ScheduleService {


	Schedule createSchedule(Date startDate, League league);

}
