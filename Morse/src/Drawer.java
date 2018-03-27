import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.hardware.port.MotorPort;


public class Drawer {

	EV3LargeRegulatedMotor leftMotor;
	EV3LargeRegulatedMotor rightMotor;
	EV3MediumRegulatedMotor markerHandleMotor;
	
	Drawer() {
		leftMotor = new EV3LargeRegulatedMotor(MotorPort.A);
		rightMotor = new EV3LargeRegulatedMotor(MotorPort.B);
		markerHandleMotor = new EV3MediumRegulatedMotor(MotorPort.C);
	}
	
	public void drawLine() {
		markerHandleMotor.rotate(-90);
		leftMotor.rotate(300, true);
		rightMotor.rotate(300);
		markerHandleMotor.rotate(90);
	}

	public void drawPoint() {
		leftMotor.rotate(300, true);
		rightMotor.rotate(300);
		markerHandleMotor.rotate(-90);
		markerHandleMotor.rotate(90);
		leftMotor.rotate(300, true);
		rightMotor.rotate(300);
	}

	public void drawSpace() {
		leftMotor.rotate(600, true);
		rightMotor.rotate(600);
	}

}
