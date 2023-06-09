package Common;

public class Constants {

    /** Базовый URL ЛКК*/
    private static final String BASE_URL = "http://profile.ivanov.polygon.dev-napopravku.ru/clinic";

    /** Данные для авторизации*/
    private static final String LOGIN = "i.ivanov.napopravku@gmail.com";
    private static final String PASSWORD = "Xkxzqu2FGi5Hrmt";

    /** Данные на добавление клиники*/
    private static final String CLINIC_NAME = "Тестовая000";
    private static final String CLINIC_TYPE = "Тестовый";
    private static final String CLINIC_CITY = "Санкт-Петербург";
    private static final String CLINIC_ADDRESS = "Вилеровский, 6";
    private static final String COMMENT_FOR_ADDRESS = "пояснялово";
    private static final String TEL_NUMBER = "1111111111";
    private static final String COMMENT_FOR_TELL_NUMBER = "пояснялово2";
    private static final String SITE_NAME = "facebook.com";

    /** Плашка "Ожидает модерации"*/
    private static final String WAITING_FOR_MODERATION = "(ожидает модерации)";

    public static String getBaseUrl() {
        return BASE_URL;
    }

    public static String getLogin() {
        return LOGIN;
    }

    public static String getPassword() {
        return PASSWORD;
    }

    public static String getClinicName() {
        return CLINIC_NAME;
    }

    public static String getClinicType() {
        return CLINIC_TYPE;
    }

    public static String getClinicCity() {
        return CLINIC_CITY;
    }

    public static String getClinicAddress() {
        return CLINIC_ADDRESS;
    }

    public static String getCommentForAddress() {
        return COMMENT_FOR_ADDRESS;
    }

    public static String getTelNumber() {
        return TEL_NUMBER;
    }

    public static String getCommentForTelNumber() {
        return COMMENT_FOR_TELL_NUMBER;
    }

    public static String getSiteName() {
        return SITE_NAME;
    }

    public static String getWaitingForModeration() {
        return WAITING_FOR_MODERATION;
    }
}
