
public static void main(String[] args){
    GenericsClass<integer> intObj = new GenericsClass<>(5);
    System.out.println("Generic class returns:"+intObj.getData();
     GenericsClass<String> stringObj = new GenericsClass<>("Java Programming");
     System.out.println("Generic class returns:"+stringObj.getData();
    )
}

class GenericClass<>{
    private T data;
    public GenericsClass(T data){
        this.data = data;
    }

    public T getData(){
        return this.data;
    }
}