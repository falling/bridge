
abstract class Messager {


    protected MessagerImp msgImp;


    protected  Messager(MessagerImp msgImp){
        this.msgImp=msgImp;
    }

    public abstract void login(String username, String password);
    public abstract void sendMessage(String message);
    public abstract void sendPicture(Image image);

}

abstract class MessagerImp{

    public abstract void playSound();
    public abstract void drawShape();
    public abstract void writeText();
    public abstract void connect();
}


//1+1+n+m =1+1+5+5= 12

//平台实现
class PCMessagerImp extends MessagerImp {


    @Override
    public void playSound() {
        //**********
    }

    @Override
    public void drawShape() {
        //**********
    }

    @Override
    public void writeText() {
        //**********
    }

    @Override
    public void connect() {
        //**********
    }

}


class MobileMessagerImp extends MessagerImp {


    @Override
    public void playSound() {
        //==========
    }

    @Override
    public void drawShape() {
        //==========
    }

    @Override
    public void writeText() {
        //==========
    }

    @Override
    public void connect() {
        //==========
    }

}


//业务抽象
class MessagerLite extends Messager  {


    @Override
    public void login(String username, String password) {
        msgImp.connect();
        //........
    }

    @Override
    public void sendMessage(String message) {
        msgImp.writeText();
        //........
    }

    @Override
    public void sendPicture(Image image) {
        msgImp.drawShape();
        //........
    }
}


class MessagerPerfect extends Messager {



    @Override
    public void login(String username, String password) {
        msgImp.playSound();
        //********
        msgImp.connect();
        //........
    }

    @Override
    public void sendMessage(String message) {
        msgImp.playSound();
        //********
        msgImp.writeText();
        //........
    }

    @Override
    public void sendPicture(Image image) {
        msgImp.playSound();
        //********
        msgImp.drawShape();
        //........
    }
}






class Client {

    public static void main(String args[]) {

        //编译时装配
        Messager m = new MessagerPerfect( new PCMessagerImp());
    }
}


