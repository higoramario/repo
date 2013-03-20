package exercicios

class VariavelValor {

  val inteiro:Int = 10
  val booleano:Boolean = true
  val nome:String = "TesteValor"
  val duplo:Double = 2.2
  val objeto:ScalaObject = null
  val void:AnyVal = 100
  var novoValor = 5
   
}

object ExercicioScala extends App{
	
	//Exercicio 1
	val soma = 10+(20+(152%(3)))
	
	def pow(valor: Int, potencia: Int) : Int = {
	  math.pow(valor.toDouble,potencia.toDouble).toInt
	}
	println("Ex.1-Valor da potencia:"+(pow(soma,math.round(2.3f))))
	
	//Exercicio 2
	val vValor = new VariavelValor
	println("Ex.2-"+(vValor.nome))
	vValor.novoValor = 500
	//vValor.inteiro = 10
	
	
	//Exercicio 3.1
	def imprimeNumero = {println("Ex.3.1-"+(num))}
	def num : String= {10.toString}
	
	def inverteNome(nome:String,indice:Int) : String = {
	  nome.reverse
	}
	println("Ex.3.1-"+(inverteNome("Higor",10)))
	imprimeNumero
	
	
	//Exercicio 3.2
	
	def devolveDois = 2
	println("Ex.3.2-"+(devolveDois))
	
	//Exercicio 3.3
	
	def recursivo(num:Int):Int = {
	  println("Ex.3.3-"+(num))
	  if(num >(0)) recursivo(num-1)
	  else num
	} 
	println(recursivo(10))
	
	
	//Exercicio 4.1
	var hello = if(true) "Hello world!" else "Goodbye world!"
	println("Ex.4-"+(hello))
	
	if(1+10 == 11){
	  100*100
	}
	else{
	  10*100
	}
		
	//Exercicio 4.2
	val goodbye = if(1 == 1) 100
	println("Ex.4.2-"+(goodbye.toString))
	
	
	//Exercicio 4.3
	def metodo = if(false) "Verdadeiro" else "Falso"
	println("Ex.4.3-"+(metodo))
	
	
	//Exercicio 5.1
	val classA = new ClasseA
	println("Ex.5.1-"+(new ClasseB(classA.valorA,classA.variavelA).toString))
	
	//Exercicio 5.2
	val caseC = CaseClasseC
	val caseB = CaseClasseB(classA.valorA,classA.variavelA)
	
	//Exercicio 5.3
	println("Ex.5.3-ClasseA:"+(new ClasseA))
	println("Ex.5.3-ClasseB:"+(new ClasseB(classA.valorA,classA.variavelA)))
	println("Ex.5.3-ClasseC:"+(new ClasseC(10,'h').toString()))
	println("Ex.5.3-CaseClasseB:"+(CaseClasseB))
	println("Ex.5.3-CaseClasseB:"+(caseB.variavelInt+(","+(caseB.variavelString))))
	println("Ex.5.3-CaseClasseC:"+(CaseClasseC.toString))
	println("Ex.5.3-CaseClasseC.letra:"+(CaseClasseC(5,'g').letra))
	
	
	//Exercicio 6
	object Objeto {
	  val nome = "Nome do Objeto"
	  def vezes(inteiro:Int,exp:Int) : Double = {
	    inteiro*exp
	  }
	}
	
	object Novo {
	  var num1 = 0
	  var num2 = 0
	  val numero = Objeto.vezes(num1, num2)
	}
	
	case object CaseObjeto {
	  val nome = "Nome do CaseObjeto"
	  val tamanho = 2
	  var limite = 100
	  def tamanhoLimite : Int = {
	    tamanho*limite
	  }
	}
	
	println("Ex.6-Objeto:"+(Objeto.nome))
	println("Ex.6-Objeto:"+(Objeto.toString()))
	Novo.num1 = 12
	Novo.num2 = 6
	println("Ex.6-Novo:"+(Novo.numero))
	println("Ex.6-CaseObjeto:"+(CaseObjeto.nome))
	CaseObjeto.limite = 1000
	println("Ex.6-CaseObjeto:"+(CaseObjeto.tamanhoLimite))
	println("Ex.6-CaseObjeto:"+(CaseObjeto.toString))
	println("Ex.6-CaseObjeto:"+(CaseObjeto.limite))
	
	
	//Exercicio 7

	val funcaoIntString : (Int => String) = (inteiro:Int) => {
	  inteiro.toString
	}
	
	val funcaoReversa : (String => String) = (palavra:String) => {
	  palavra.reverse
	}
	
	var funcaoQualquer : (Any=>String) = (any:Any) =>{
	  if(any!=(null))
		  "Qualquer coisa"
	  else
	    "Nulo"
	}
	
	println("Ex.7.1-funcaoIntString:"+(funcaoIntString(1535)))
	println("Ex.7.1-funcaoReversa:"+(funcaoReversa("Uma frase para inverter")))
	println("Ex.7.1-funcaoQualquer:"+(funcaoQualquer(1535)))
	println("Ex.7.1-funcaoQualquer:"+(funcaoQualquer(null)))
	println("Ex.7.1-funcaoQualquer:"+(funcaoQualquer()))
	
	//Exercicios 7.2
	
	def recebeFuncao(funcao:(Int => String)) = {
	  funcao(12345)
	}
	
	def recebeFuncaoReversa(funcao:(String=>String),nome:String) = {
	  funcao(nome)
	}
	
	//Exercicios 7.3
	
	def devolveFuncao(inteiro:Int) : (Int => String) = {
	  val funcao : (Int => String) = (inteiro:Int) => {
	    inteiro.toString
	  }
	  funcao
	}
	
	def devolveFuncaoReversa(palavra:String) : (String => String) = {
	  //palavra = palavra+(" passou pelo metodo")
	  funcaoReversa
	}
	
	def devolveFuncaoReversa2() : (String => String) = {
	  //palavra = palavra+(" passou pelo metodo")
	  funcaoReversa
	}
	
	
	//Exercicios 7.4
	
	def recebeDevolveFuncao(funcao:(Int => String)) : (String => String) = {
	  funcaoReversa
	}
	
	
	//Exercicios 7.5
	
	def metodoSimilar(inteiro:Int) : String = {
	  inteiro.toString
	}
	
	
	println("Ex.7.2-recebeFuncao:"+(recebeFuncao(funcaoIntString)))
	println("Ex.7.2-recebeFuncaoReversa:"+(recebeFuncaoReversa(funcaoReversa, "Higor Amario")))
	val funcao = devolveFuncao(123454321)
	println("Ex.7.3-devolveFuncao:"+(funcao(123456789)))
	var funcRev = devolveFuncaoReversa("123456789")
	println("Ex.7.3-devolveFuncaoReversa:"+(funcRev("123456789")))
	funcRev = devolveFuncaoReversa2()
	println("Ex.7.3-devolveFuncaoReversa2:"+(funcRev("987654321")))
	funcRev = recebeDevolveFuncao(funcaoIntString)
	println("Ex.7.4-recebeDevolveFuncao:"+(funcRev("Funcao Reversa")))
	println("Ex.7.5-chamaMetodoSimilar:"+(recebeFuncao(metodoSimilar)))
	
	
}

//Exercicio 5
class ClasseA{
  
  val valorA = 15
  var variavelA = "ExemploTexto"
  
}

class ClasseB(variavelInt:Int,variavelString:String)
{
  val variavelNome = variavelString + variavelInt.toString
  
  override def toString() : String = {
    "{"+(variavelNome+("}"))
  }
  
}

class ClasseC(qtde:Int,letra:Char)
{
  var i = 0
  var saida:String = ""
  while(i <(qtde)){
    i=(i+(1))
    saida=(saida+(letra))
  }
  println(saida)
}

case class CaseClasseC(qtde:Int,letra:Char)

case class CaseClasseB(variavelInt:Int,variavelString:String)
{
  println("CaseClasseB"+(variavelString+(variavelInt.toString)))
}




