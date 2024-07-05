package org.example.sesiketujuh.service.implementation;

import org.example.sesiketujuh.model.ManageKendaraan;
import org.example.sesiketujuh.service.ManageService;

public class ManageServiceImpl implements ManageService {
    @Override
    public void process(ManageKendaraan manageKendaraan) {
        manageKendaraan.getKendaraan();
    }
}
