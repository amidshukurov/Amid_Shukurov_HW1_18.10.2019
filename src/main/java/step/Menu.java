package step;

public class Menu {

  public String show() {
    StringBuilder sb = new StringBuilder();
    sb.append("===============================================\n");
    sb.append("|                     Booking App             |\n");
    sb.append("===============================================\n");
    sb.append("| 1. Online-board. Show timetable             |\n");
    sb.append("| 2. Show the flight info Make a booking      |\n");
    sb.append("| 3. Search and book a flight Show my bookings|\n");
    sb.append("| 4. Cancel the booking Cancel my booking     |\n");
    sb.append("| 5. My flights Exit                          |\n");
    sb.append("| 6. Exit                                     |\n");
    sb.append("========================\n");
    return sb.toString();
  }
}
