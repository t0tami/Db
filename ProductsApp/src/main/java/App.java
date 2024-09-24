public class App {
    public static void main(String[] args){
        dbConnectionImpl connection = new dbConnectionImpl() ;
        connection.showData(connection.connect());
        }
    }

