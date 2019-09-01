package demo

// Matt Stillwell
// Written Aug 31 2019

var time: Int = 0
var afterKnife: Boolean = false
var deaths: Int = 0
var name: String? = ""

fun hallway()
{
    println("You are in the hallway\n\u001B[36mDo you decide to go back into your room or go downstairs? (room, stairs)\u001B[0m")
    if (readLine() == "room")
        room()
    else
        stairs()
}

fun room()
{
    println("You are back in your room\n\u001B[36mDo you decide to turn on the light? (y/n)\u001B[0m")
    if (readLine() == "y")
    {
        if(deaths == 0)
        {

            if(afterKnife)
            { 
                 println("The lights turn on and you are greeted with a small, blue room with a bed, a desk, and a bathroom")
                 println("\u001B[36mDo you go to the desk, bed, or bathroom? (desk/bed/bathroom)\u001B[0m")
            }
            else
            {
                  println("The lights turn on and you are greeted with a small, blue room with a bed, a goldfish tank, and a desk")
                  println("\u001B[36mDo you go to the desk, bed? (desk/bed)\u001B[0m")
            }

            var choice = readLine()
            if (choice == "desk")
            {
                println("You see a telephone, a notepad and a picture of your family")
                println("\u001B[36mWhich do you inspect? (telephone, notepad, picture)\u001B[0m") 
                val a = readLine()
                if (a == "telephone")
                {
                    println("You pick up the telephone and see a slip of paper next to the phone with 1 phone number on it\n\u001B[36mDo you call the number or do you press redial? (number/redial)\u001B[0m")
                    if (readLine() == "number")
                    {
                        println("The phone rings\nYou hear a boy talk to you on the other end\n'\u001B[33mHey $name, I heared about what happened to you last night\u001B[0m'\n'\u001B[33mI hope your doing okay man\u001B[0m'\nHe pauses for a second and then says '\u001B[33mYou must know I'm here for you no matter what\u001B[0m'\n'\u001B[33mI am sorry I can't talk more, I have to get going, I can talk later\u001B[0m'\n")
                    } else {
                        println("The phone rings\nYou hear a man on the other end\n'\u001B[33mSuicide hotline. How can we help you?\u001B[0m'\nYou hang up immediately")
                    }
                }
                else if (a == "notepad")
                {
                    println("You look at the notepad and see a bunch of drawings of stratched out images of stick figures hanging from trees")
                }
                else
                {
                    println("You look at a picture of yourself and a man and a woman next to you")
                }

                println("You turn off the light and leave the room")
                hallway()
            } else if (choice == "bed"){
                println("You turn off the lights\nYou get into bed\nAn hour passes and you wake up more refreshed then before\nYou roll out of bed and leave the bedroom")
                time ++
                hallway()
            } else if (choice == "bathroom") {
                println("You go into the bathroom and look at yourself in the mirror\nYou look like you havent sleep in weeks\nYou check your pockets and find a little white pill\n\u001B[36mDo you take it? (y/n)\u001B[0m")
                if (readLine() == "y")
                {
                	println("As soon as you take the pill, you begin to immediately feel happier\nYou leave the bathroom and make your way to the steps\nAs you begin going down the steps you collapse and your body rolls down the stairway\n\u001B[31mAs you reach the bottom your bones are dislocated and you have stopped breathing\nThe woman screams and runs over to you checking for your pulse but cannot find one\nShe holds your body and cries profusely\n\nEverything goes black and then you wake up back in your room with a memory of what just happened\u001B[0m")
                    deaths++
                    room()
                }
                else
                {
                    println("You put the pill back in your pocket and leave your room entirely")
                    hallway()
                }
            }
        } else if(deaths == 1)
        {
            println("The lights turn on and you are greeted by your room that grew up in")
            println("\u001B[36mDo you jump out the window, or check your pockets? (window/pocket)\u001B[0m")
            if (readLine() == "window")
            {
                println("You jump out the window and dislocate your leg, but you are outside now\nYou can hear from inside the house your mom saying '\u001B[33mGood morning $name, I made some breakfast for you!\u001B[0m'")
                outside()
            } else {
                println("You reach into your pocket where the pill had been and now find a gun instead\n\u001B[36mDo you put the gun down or shoot yourself (down/yourself)\u001B[0m")
                var choice = readLine()
                if (choice == "down")
                {
                    println("You put the gun back in your pocket")
                    room()
                } else {
                    println("\u001B[31mYou go into the bathroom and watch as the boy in the mirror puts the hardgun up to the side of his head\nThe boy in the mirror pulls the trigger and you instantly feel cold as the blood baths the room\nEverything goes black once again until it doesn't\u001B[0m")
                    deaths++
                    room()
                }
            }
        } else if(deaths == 2)
        {
            println("The lights turn out, the window is open and you immediate sprint at it")
            println("You jump out the window and dislocate your leg, but you are outside now\nYou can hear from inside the house your mom saying '\u001B[33mGood morning $name, I made some breakfast for you!\u001B[0m'")
            outside()
        }
    }
    else
    {
        println("The lights remain off and you walk back into the hallway")
        hallway()
    }
}

fun stairs()
{
    println("\nYou walk down the steps and are greeted by a woman\n'\u001B[33mGood morning Sweetie\u001B[0m' she says\nYou walk over to the table and sit down across from the woman\n'\u001B[33mHow are you feeling\u001B[0m' she asks in a kind manner\nYou sit there silently not making eye contact \nShe slides the goldfish snacks over to you and eats her meal quietly\nWhen you dare to look up you see the woman staring at you intently\nYou can tell that the woman is silently crying but you do not acknoledge it\nYou hear a phone ringing from another room\nThe woman gets up and leaves the room to enter the other room\n\nYou look around the dining room and see a door\n\u001B[36mDo you get out of your seat and head for it? (y/n)\u001B[0m")
    if (readLine() == "y")
    {
        frontdoor()
    } else {
        println("You can tell that the woman is talking on the phone but you cannot make out what she is saying (maybe she is whispering)\nSoon she stops talking altogether and comes back into the dining room\nShe says '\u001B[33mI just got off the phone with the doctor\u001B[0m'\nShe pauses for a moment and then continues\nShe says '\u001B[33mYour father is not going to make it\u001B[0m' and she breaks down weeping\nYou stare at the woman and contemplate comforting her\n\u001B[36mDo you comfort her? (y/n)\u001B[0m")
        if (readLine() == "y")
        {
             println("You console the woman and then sit back in your chair\nYou can tell the womans sobbing is letting up a bit\nYou have a desire to leave the house\nYou head for the door")
             frontdoor()
        } else {
             println("You sit there silently as the woman is breaking down\nYou get up head for the door")
             frontdoor()
        }
    }
            
}

fun frontdoor()
{
    println("You begin to open the front door\nThe woman comes barging into the room and shuts it immediately\n'\u001B[33mNo\u001B[0m' she says firmly\nShe rolls up your sleeves and sees fresh cuts against your wrists\nShe asks '\u001B[33mWhere are you keeping it?\u001B[0m'\nShe forces you up the stairs and into your room\nShe flips over the bed and finds a knife\nShe takes it and leaves you alone in the room")
    afterKnife = true
    room() 
}

fun outside()
{

    println("You are outside, and you take a few steps out onto the road and are immediately hit by a truck\n\nYou wake up and turn on the lights to your room again\nThis time your room is completely white and has cushioned padding on each wall\nThere is nothing in the room\nYou look down and see that you are strapped up in a harness not allowing you to move\n\u001B[31mYou fall over and cannot get back up\u001B[0m")

    //if(deaths == 1)
    //
    //else if(deaths == 2)
    //

}

fun puts(str: String, color: String)
{

    var resetAscii: String = "\u001B[0m"
    var colorAscii: String = ""
    if(color == "purple")
        colorAscii = "\u001B[35m"
    else if(color == "yellow")
        colorAscii = "\u001B[31m"

    println(colorAscii + str + resetAscii)

}


// Auto run main method
fun main(args: Array<String>) 
{

    print("\u001B[35m\n===============\n   MEANING\n===============\n\n")

    var correct: String?
    do 
    {
        println("\u001B[0mLet's start out with your name\nWhat is your name?")
        name = readLine()

        println("Oh so your name is $name\n\u001B[36mIs that correct? (y/n)\u001B[0m")
        correct = readLine()

        //if (correct == "y") {
        //    println("yes")
        //} else {
        //    println("no")
        //}
    } while (correct == "n")

    puts("goose", "purple")
    println("\nThis is last time you will have the chance to go back on your decisions\nIn life there are no do overs\n")
    
    println("You wake up in a dark room lying on a bed\nYou sit up and make your way to the door\nYou open the door and are blinded by light momentarly\nYou hear a female voice calling out\n'\u001B[33mGood morning $name, I made some breakfast for you!\u001B[0m'\n")
    
    hallway()

}

