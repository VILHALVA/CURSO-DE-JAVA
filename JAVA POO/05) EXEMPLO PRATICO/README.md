# INPUT BANCO
```java
public void abrirConta() {
	// ABRIR A CONTA: //
  input = new Scanner(System.in);
  this.setStatus(true);
  System.out.println("Digite o seu nome: ");
  this.dono=input.nextLine();
  
  System.out.println("Informe o numero da conta a ser utilizado: ");
  	this.numConta=Integer.parseInt(input.nextLine());
  
  System.out.print("Informe o tipo de conta:\ncc-CONTA CORRENTE\ncp-CONTA POUPANÇA\n");
  	this.tipo=input.nextLine();

  	if (this.tipo.equals("cc")) {
   		this.setSaldo(50);
	}
	else if (this.tipo.equals("cp")) {
   		this.setSaldo(150);
  	}
 }
```