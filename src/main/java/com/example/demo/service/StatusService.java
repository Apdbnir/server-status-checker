package com.example.demo.service;

import com.example.demo.dao.StatusDao;
import com.example.demo.dto.StatusResponse;
import org.springframework.stereotype.Service;

@Service
public class StatusService {
    private final StatusDao statusDao;

    public StatusService(StatusDao statusDao) {
        this.statusDao = statusDao;
    }

    public StatusResponse checkServerStatus(String serverUrl) {
        return statusDao.checkServerStatus(serverUrl);
    }
}