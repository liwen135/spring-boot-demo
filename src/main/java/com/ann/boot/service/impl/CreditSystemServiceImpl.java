package com.ann.boot.service.impl;

import com.ann.boot.service.CreditSystemService;
import org.springframework.stereotype.Service;

@Service
public class CreditSystemServiceImpl implements CreditSystemService {

    @Override
    public int getUserCredit(int userId) {
        throw new UnsupportedOperationException("积分系统未完成，不能调用");
    }

    @Override
    public boolean addCedit(int userId, int score) {
        throw new UnsupportedOperationException("积分系统未完成，不能调用");
    }

}
