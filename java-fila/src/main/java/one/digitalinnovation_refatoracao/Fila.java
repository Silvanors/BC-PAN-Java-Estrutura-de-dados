package one.digitalinnovation_refatoracao;

//Classe Fila (FIFO: First In, First Out)
public class Fila {

    //implementar a referência de entrada na fila pelo final dela.
    private No refNoEntradaFila;

    //construtor para instanciar a estrutura de dados Fila que ela seja nula (vazia)
    public Fila() {
        this.refNoEntradaFila = null;
    }

    //2º metodo é o enfileirar "enqueue"

    //public void enqueue(No novoNo) {
    public void enqueue(Object obj) {
        No novoNo = new No(obj);
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    //4º metodo é o "dequeue" que responde quem é o primeiro da fila e o tira da fila
    public Object dequeue() {
        //primeira coisa aqui dentro é testar se a fila não está vazia
        if (!this.isEmpty()) {
            No primeiroNO = refNoEntradaFila;
            No noAuxiliar = refNoEntradaFila;
            //top continuo até chegar ao primeiro da fila
            while (true) {
                //se não for o primeiro
                if (primeiroNO.getRefNo() != null) {
                    noAuxiliar = primeiroNO;
                    primeiroNO = primeiroNO.getRefNo();
                } else {
                    noAuxiliar.setRefNo(null);
                    break;
                }

            }
            return primeiroNO.getObject();
        }
        return null;
    }

    //3º metodo é o "first" que responde quem é o primeiro da fila
    public Object first(){
        //primeira coisa aqui dentro é testar se a fila não está vazia
        if(!this.isEmpty()){
            No primeiroNO = refNoEntradaFila;
            //top continuo até chegar ao primeiro da fila
            while (true){
                //se não for o primeiro
                if(primeiroNO.getRefNo() != null) {
                    primeiroNO = primeiroNO.getRefNo();
                }else{
                    break;
                }

            }
            return primeiroNO.getObject();
        }
        return null;

    }

    //1º metodo a ser implementado é o "isEmpty" que verifica se a referência de entrada está vazia
    public boolean isEmpty() {
        return refNoEntradaFila == null ? true : false;

    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No noAxiliar = refNoEntradaFila;

        if(refNoEntradaFila != null){
            while (true){
                stringRetorno += "[No{objeto=" + noAxiliar.getObject() + "}]--->";
                if(noAxiliar.getRefNo() != null) {
                    noAxiliar = noAxiliar.getRefNo();
                }else{
                    stringRetorno += "null";
                    break;
                }
            }

        }else{
            stringRetorno = "null";
        }

        return stringRetorno;
    }
}
