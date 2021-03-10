package org.firstinspires.ftc.teamcode

import com.qualcomm.robotcore.eventloop.opmode.Autonomous
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode

@Autonomous(name = "Park on line")
class ParkOnLine : LinearOpMode() {
    override fun runOpMode() {
        val robot = RobotHardware()
        robot.init(hardwareMap, "")
        waitForStart()
        robot.chassis(doubleArrayOf(-1.0, 0.0, 0.0))  //y, x, x
        sleepInches(62.0)
        robot.chassis(doubleArrayOf(0.0, -1, 0.0))  //y, x, x ; spin the robot
        sleepInches(10.0)
        robot.startFlywheels()
        robot.fire()
        sleep(200)
        robot.fire()
        sleep(200);
        robot.fire();
        robot.brake()
    }

    private fun sleepInches(inches: Double) {
        sleep((inches / (RobotHardware.INCHES_PER_SECOND / 1000)).toLong())
    }

}