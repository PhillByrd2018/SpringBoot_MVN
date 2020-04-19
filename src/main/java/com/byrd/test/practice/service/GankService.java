package com.byrd.test.practice.service;

import com.byrd.test.practice.model.CanGank;
import com.byrd.test.practice.repository.GankRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GankService {

    @Autowired
    private GankRepo gankRepo;

    public boolean willGank(boolean canHaveFarm) {
        if (canHaveFarm == true) {
            CanGank cg = gankRepo.getOne(1);
            return cg.getCanGank();
        } else {
            return false;
        }
    }
}