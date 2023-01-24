import 'package:flutter/material.dart';

import 'home.dart';

class Log extends StatelessWidget {
  const Log({super.key});

  @override
  Widget build(BuildContext context) {
    return const MaterialApp(
      home: Login(),
    );
  }
}

class Login extends StatefulWidget {
  const Login({super.key});
  @override
  State<StatefulWidget> createState() => LoginPage();
}

class LoginPage extends State<StatefulWidget>{
  final emailController = TextEditingController();
  final passController = TextEditingController();

  final String email = 'pippo@pippo';
  final String password = 'pippo';

  String statuslogin = '';

  @override
  void dispose(){
    emailController.dispose();
    passController.dispose();

    super.dispose();
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Pagina di login'),
      ),
      body: Center(
        child: Column (
            mainAxisAlignment: MainAxisAlignment.start,
          children: <Widget> [
             _emailText(),
            _passwordText(),
            _submitButton(),
            _statusLogin()
          ],
        ),
        ),
      );
  }

  Widget _emailText () => Padding(padding: const EdgeInsets.all(10),
  child:TextField(
    controller: emailController,
    decoration: const InputDecoration(
      icon: Icon(Icons.email),
      hintText: 'esempio@dominio',
      labelText: 'email',
    ),
  ),
  );
  Widget _passwordText () => Padding(padding: const EdgeInsets.all(10),
    child:TextField(
      controller: passController,
      obscureText: true,
      decoration: const InputDecoration(
        icon: Icon(Icons.lock),
        hintText: 'password',
        labelText: 'password',
      ),
    ),
  );
  Widget _submitButton () => Padding(
      padding: const EdgeInsets.all(10),
      child: FloatingActionButton(
        onPressed: _submitMethod,
    child: const Text('Invio'),
  ),
  );

  Widget _statusLogin () => Text(statuslogin);

  _submitMethod() {
    if (emailController.text==email && passController.text==password){
      Route route = MaterialPageRoute(builder: (context) => Home());
      Navigator.push(context, route);
    } else {
      setState(() {
        statuslogin = 'email o password errati, riprova';
      });
    }

  }
}