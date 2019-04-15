package com.joham.service;

import com.joham.dao.SysLogDAO;
import com.joham.entity.SysLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author joham
 */
@Service
public class SysLogService {

    @Autowired
    SysLogDAO sysLogDAO;

    public void saveLogger(SysLog sysLog) {
        sysLogDAO.save(sysLog);
    }
}
