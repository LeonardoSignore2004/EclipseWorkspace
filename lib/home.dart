import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:tps_progetto/logic/models/Mysql.dart';
import 'package:tps_progetto/login.dart';

class Home extends StatelessWidget {
  const Home({super.key});

  @override
  Widget build(BuildContext context) {
    return const MaterialApp(
      home: HomePageState(),
    );
  }

}

class HomePageState extends StatefulWidget{
  const HomePageState({super.key});

  @override
  State<StatefulWidget> createState() => HomePage();
}

class HomePage extends State<StatefulWidget> {

  //input form
  final nomeController = TextEditingController();
  final pesoController = TextEditingController();
  final altezzaController = TextEditingController();
  final etaController = TextEditingController();

  //BMI variabili
  double bmi = 0;
  String nome = '';
  double currentSliderValue = 20;
  double high = 0;
  String genere = '';
  bool genereM = true;
  bool genereF = false;//true = male , false = female
  String _state = '';

  var db = new Mysql();

  @override
  void dispose() {
    nomeController.dispose();
    pesoController.dispose();
    altezzaController.dispose();
    etaController.dispose();

    super.dispose();
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        leading: Builder(
          builder: (BuildContext context) {
            return IconButton(
              icon: const Icon(Icons.arrow_back),
              onPressed: () {
                Route route = MaterialPageRoute(builder: (context) => Log());
                Navigator.push(context, route);
              },
              tooltip: MaterialLocalizations
                  .of(context)
                  .openAppDrawerTooltip,
            );
          },
        ),
        title: const Text('Calcolatore BMI'),
      ),
      body: Center(
        child: Column(children: <Widget>[
          const Padding(padding: EdgeInsets.all(20),
          ),
          Row(
            mainAxisAlignment: MainAxisAlignment.spaceAround,
            children: [
              _bottoneGenereM('male'),
              _bottoneGenereF('female'),
            ],
          ),
          SizedBox (
            height: 20,
          ),
          _textInput2('nome', Icons.person, nomeController),
          _textInput2('peso', Icons.monitor_weight, pesoController),
          _textInput2('eta', Icons.accessibility_rounded, etaController),
          _sliderButton(),
          _bottoneBMI(),
          _textOutputBMI(),
        ],),
      ),
    );
  }

  Widget _textOutputBMI ()=>
      Container(
        alignment: Alignment.center,
        margin: EdgeInsets.all(2),
        padding: EdgeInsets.all(2),
        decoration: BoxDecoration(
            borderRadius: BorderRadius.circular(30.0),
            color: Colors.blue.shade200,
        ),
        child:Column(
          mainAxisAlignment: MainAxisAlignment.center,
          mainAxisSize: MainAxisSize.max,
          children: <Widget>[
            Text('$nome il tuo BMI è ', style: const TextStyle(
              fontSize: 20,
            ),),
            Text(bmi.toStringAsFixed(3), style: const TextStyle(
              fontSize: 30,
              fontWeight: FontWeight.bold,
            ),),
            Padding(
              padding: EdgeInsets.all(15),
              child:Text(_state,
                style: const TextStyle(
                  fontSize: 25,
                ),) ,)
          ],
        ),
      );

  Widget _sliderButton () => Padding (
    padding: EdgeInsets.all(20),
    child: Column (
      children: <Widget>[
        Row(
          mainAxisSize: MainAxisSize.max,
          mainAxisAlignment: MainAxisAlignment.spaceEvenly,
        children: <Widget> [
            const Text('altezza',
              style: TextStyle(
              fontSize: 17,
            ),),
            SizedBox (
              width: 250,
              height: 10,
              child: Row(
                children: [
                  Expanded(
                    child: Slider(
                    activeColor: Colors.blueAccent,
                    inactiveColor: Colors.blue.shade100,
                    value: currentSliderValue,
                    min: 0,
                    max: 220,
                    divisions: 160,
                    label: currentSliderValue.round().toString(),
                    onChanged: (double value){
                      setState(() {
                        currentSliderValue = value;
                        high = currentSliderValue;
                      });
                    },
                  ),
                  ),
                ],
              ),
            ),
          _sideDx(),
          ],
        ),

      ],
    ),
  );

  Widget _sideDx () => Container (
    height: 20,
    child: Text(high.toStringAsFixed(0)),
  );

  Widget _bottoneGenereF (String genere){
    return Container(
      height: 100,
      width: 100,
      alignment: Alignment.center,
      decoration: BoxDecoration(
        borderRadius: BorderRadius.circular(40),
        color: genereM ? Colors.red : Colors.green ,
        boxShadow: [
          BoxShadow(
            color: genereM ? Colors.black : Colors.lightGreen,
            spreadRadius: 3,
            blurRadius: genereM ?  20 : 15,
            offset: Offset(0, 4), // changes position of shadow
          ),
        ],
      ),

      child: FittedBox(
        child: TextButton(
            child: Text("$genere",style: TextStyle(
              color: Colors.white,
              fontSize: 20,
            ),),
            onPressed: (){setState(() {
              if (genere == 'female') {genereM = false;}
              else
              if (genere == 'male') {genereM = true;}
            });}
        ),
      ),
    );
  }

  Widget _bottoneGenereM (String genere){
    return Container(
      height: 100,
      width: 100,
      alignment: Alignment.center,
      decoration: BoxDecoration(
        borderRadius: BorderRadius.circular(40),
        color: genereM ? Colors.green : Colors.red ,
        boxShadow: [
      BoxShadow(
      color: genereM ? Colors.lightGreen : Colors.black,
      spreadRadius: 3,
      blurRadius: genereM ? 15  : 20,
      offset: Offset(0, 4), // changes position of shadow
    ),
    ],
      ),

        child: FittedBox(
          child: TextButton(
              child: Text("$genere",style: TextStyle(
                color: Colors.white,
                fontSize: 20,
              ),),
              onPressed: (){setState(() {
                if (genere == 'female') {genereM = false;}
                else
                if (genere == 'male') {genereM = true;}
              });}
          ),
        ),
    );
  }
  Widget _textInput2 (String testo,IconData icon, TextEditingController controller){
    return Padding(
      padding: const EdgeInsets.all(10),
      child: TextField(
        controller: controller,
        cursorColor: Colors.black,
        style: const TextStyle(
            color: Colors.white
        ),
        decoration: InputDecoration(
          prefixIcon: Icon(icon),
          hintText: testo,
          filled: true,
          fillColor: Colors.blueAccent.shade100,
          border: OutlineInputBorder(
              borderSide: BorderSide.none,
              borderRadius: BorderRadius.circular(50)
          ),
        ),
      ),
    );
  }
  Widget _textInput (String testo,IconData icon, TextEditingController controller)=> Padding(
    padding: EdgeInsets.all(20),
  child:TextFormField(
    controller: controller,
    decoration: InputDecoration(
      prefixIcon: Icon(icon),
      hintText: testo,
    ),
  ),);

  Widget _bottoneBMI () => Padding(
    padding: EdgeInsets.all(20),
    child: FloatingActionButton(
        onPressed: () {_calcolaBMI;_insert();},
            child: const Text('Invia', style: TextStyle(
              fontStyle: FontStyle.normal,
            ),),
    ),
  );

  _insert (){
    db.getConnection().then((conn) {
      String sql = 'insert into flutter.persona (nome,eta,sesso,peso,altezza,id) values (leo,18,M,70,175,1);';
      conn.query(sql);
    });
  }

  _calcolaBMI() {
    //double altezza = double.parse(altezzaController.text)/100;
    high/=100;
    double peso = double.parse(pesoController.text);
    nome = nomeController.text;
    setState(() {
      bmi = peso/(high*high);
      if (bmi<16){
        _state = 'gravemente sottopeso';
      } else if (bmi<18.49){
        _state = 'sottopeso';
      } else if (bmi<24.99){
        _state = 'normopeso';
      } else if (bmi<29.99){
        _state = 'sovrappeso';
      } else {
        _state = 'obeso';
      }
    });
  }
}