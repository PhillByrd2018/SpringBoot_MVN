package com.byrd.test.practice.service;

import com.byrd.test.practice.model.Mordekaiser;
import com.byrd.test.practice.repository.MordRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MordService {

    @Autowired
    private MordRepo mordrepo;

    public String getAbilities(int idToSearch) {
        Mordekaiser mord = mordrepo.getOne(idToSearch);
       
        return mord.getAbility();
    }
}