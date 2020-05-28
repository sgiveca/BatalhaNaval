package entities;

public class validacaoInicio {

private String [][] matriz;
private String erro ;

public validacaoInicio(String[][] matriz) {
	this.matriz = matriz;
}

int SUB=4,HIDRO=15,DEST=6,CRUZ=5,COUR=8;
int ctSub=0, ctHidro=0, ctDest=0, ctCruZ=0, ctCour=0, ctNull=0;

public String validar() {
	validaQtde(); 
	return erro;
}

public void validaQtde() {
    for(int i=0;i<15;i++) {
        for(int n=0;n<15;n++) {
        	switch (matriz[i][n]) {
        	  case "S":
        		  ctSub++ ;
        		  break;
        	  case "H":
        		  ctHidro++ ;
        		  break;
        	  case "D":
        		  ctDest++ ;
        		  break;
        	  case "Z":
        		  ctCruZ++ ;
        		  break;        		  
        	  case "C":
        		  ctCour++ ;
        		  break;
        	  case " ":
        		  break;
        	  default:
        		  this.erro= "001 - Marcação invalida. Utilizar S, H, D, C ou Z " + i +" " + n + "= "+matriz[i][n];
        	 }
        }
    }
    if (ctSub == SUB &&
        	ctHidro == HIDRO &&
        	ctDest == DEST &&
        	ctCruZ == CRUZ && 
        	ctCour == COUR	) {}
    else {
        	     this.erro= "002 - Marcação invalida. Qtde Inf/Esp S= "+ctSub+"/"+SUB+", D="
        	    		 						 			           +ctDest+"/"+DEST+", H="
     	    		 						 			               +ctHidro+"/"+HIDRO+", Cr="
        	    		 						 			           +ctCruZ+"/"+CRUZ+", Co="
        	    		 						 			           +ctCour+"/"+COUR ;
        }
}
}
