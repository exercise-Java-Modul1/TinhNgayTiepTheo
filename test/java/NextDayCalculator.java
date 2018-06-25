public class NextDayCalculator {
    public static int NgayTiepTheo(int ngay, int thang) {
        switch (thang) {
            case 2:
                if (ngay == 29 || ngay == 28) {
                    return ngay = 1;
                } else {
                    return ngay + 1;
                }
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (ngay == 31) {
                    return ngay = 1;
                } else {
                    return ngay + 1;
                }
            case 4:
            case 6:
            case 9:
            case 11:
                if (ngay == 30) {
                    return ngay = 1;
                } else {
                    return ngay + 1;
                }
        }
        return ngay;
    }
}
