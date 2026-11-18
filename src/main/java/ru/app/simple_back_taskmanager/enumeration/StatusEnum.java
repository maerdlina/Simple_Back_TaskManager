package ru.app.simple_back_taskmanager.enumeration;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public enum StatusEnum {

    TO_DO("To-Do", "Запланировано"),
    IN_PROGRESS("In Progress", "В процессе"),
    DONE("Done", "Сделано");

    private final String code;
    private final String des;

    StatusEnum(String code, String des) {
        this.code = code;
        this.des = des;
    }

    public String getDescription() {
        return des;
    }

    public static StatusEnum fromCode(String code) {
        if (code == null) {
            return null;
        }
        for (StatusEnum type : values()) {
            if (type.code.equals(code)) {
                return type;
            }
        }
        log.warn("Неизвестное значения для BlockStatus: {}", code);
        return null;
    }

    public static String getDescriptionByCodeForCsvReport(String code) {
        StatusEnum status = fromCode(code);
        return status == null ? null : status.getDescription();
    }
}
