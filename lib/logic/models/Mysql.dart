import 'package:mysql1/mysql1.dart';

class Mysql {
  static String host = 'localhost';
  static String username = 'root';
  static String password = 'leopoldodinarnia';
  static String db = 'flutter';
  static int porta = 3306;

  Mysql();

  Future<MySqlConnection> getConnection() async {
    var settings = new ConnectionSettings(
      host: host,
      port: porta,
      user: username,
      password: password,
      db: db,
    );
    return await MySqlConnection.connect(settings);
  }
}
