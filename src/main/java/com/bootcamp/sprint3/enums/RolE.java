package com.bootcamp.sprint3.enums;

import lombok.Getter;

@Getter
public enum RolE {
    BUYER("BUYER"), SELLER("SELLER"), ADMIN("ADMIN");

    String text;

    RolE(String text) {
        this.text = text;
    }
}
