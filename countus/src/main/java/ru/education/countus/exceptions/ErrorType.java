package ru.education.countus.exceptions;

public enum ErrorType {
    STUDENT, TEACHER, CLASS;

    public static String useType(ErrorType type) {
        return switch (type) {
            case CLASS -> NotFoundException.errorClassMessage;
            case STUDENT -> NotFoundException.errorStudentMessage;
            case TEACHER -> NotFoundException.errorTeacherMessage;
        };
    }
}