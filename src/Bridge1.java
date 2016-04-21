
abstract class Messager {

    public abstract void login(String username, String password);

    public abstract void sendMessage(String message);

    public abstract void sendPicture(Image image);


    public abstract void playSound();

    public abstract void drawShape();

    public abstract void writeText();

    public abstract void connect();

}


//1+n+n*m =1+5+5*5= 31

//平台实现
abstract class PCMessagerBase extends Messager {


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


abstract class MobileMessagerBase extends Messager {


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
class PCMessagerLite extends PCMessagerBase {
    @Override
    public void login(String username, String password) {
        super.connect();
        //........
    }

    @Override
    public void sendMessage(String message) {
        super.writeText();
        //........
    }

    @Override
    public void sendPicture(Image image) {
        super.drawShape();
        //........
    }
}


class PCMessagerPerfect extends PCMessagerBase {
    @Override
    public void login(String username, String password) {
        super.playSound();
        //********
        super.connect();
        //........
    }

    @Override
    public void sendMessage(String message) {
        super.playSound();
        //********
        super.writeText();
        //........
    }

    @Override
    public void sendPicture(Image image) {
        super.playSound();
        //********
        super.drawShape();
        //........
    }
}


class MobileMessagerLite extends MobileMessagerBase {
    @Override
    public void login(String username, String password) {
        super.connect();
        //........
    }

    @Override
    public void sendMessage(String message) {
        super.writeText();
        //........
    }

    @Override
    public void sendPicture(Image image) {
        super.drawShape();
        //........
    }
}


class MobileMessagerPerfect extends MobileMessagerBase {
    @Override
    public void login(String username, String password) {
        super.playSound();
        //********
        super.connect();
        //........
    }

    @Override
    public void sendMessage(String message) {
        super.sendMessage(message);
        //********
        super.writeText();
        //........
    }

    @Override
    public void sendPicture(Image image) {
        super.playSound();
        //********
        super.drawShape();
        //........
    }
}


class Client {

    public static void main(String args[]) {

        //编译时装配
        Messager m = new MobileMessagerPerfect();
    }
}


