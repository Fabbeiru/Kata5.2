package kata5p2;

/**
 *
 * @author Fabián B.
 */

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import kata5p2.view.HistogramDisplay;
import kata5p2.model.Histogram;
import kata5p2.model.Mail;
import static kata5p2.view.ConnectionBD.connect;
import kata5p2.view.MailHistogramBuilder;
import static kata5p2.view.MailListBuilderBD.selectData_EMAIL;
import kata5p2.view.MailListReaderBD;

public class Kata5P2 {

    public static void main(String[] args) throws SQLException {

        //List<Mail> mailList = MailListReader.read("/Users/ana/Desktop/Kata5P2/src/main/email.txt");
        Connection connection = connect();
        List<Mail> mailList = MailListReaderBD.read(connection);
        Histogram histogram = MailHistogramBuilder.build(mailList);
        HistogramDisplay display = new HistogramDisplay(histogram);
        selectData_EMAIL(connection);
        display.execute();
    }
    
}