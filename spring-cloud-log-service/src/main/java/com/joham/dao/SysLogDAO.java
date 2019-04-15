package com.joham.dao;

import com.joham.entity.SysLog;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author joham
 */
public interface SysLogDAO extends JpaRepository<SysLog, Long> {
}
