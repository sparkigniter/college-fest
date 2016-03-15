package com.ladoo.myapplication;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class EventDetails extends AppCompatActivity {
    TextView EventRulesFeader, EventVenueHeader, EventTimingHeader, EventDateHeader, EventContactHeader, Contact1, Contact2, EventRegistratinFeesHeader, EventRegistrationFees;
    TextView EventRule1, EventRule2, EventRule3, EventRule4, EventRule5;
    TextView EventVenue, EventTime, EventDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_details);
        CulturalEvents CulturalPosition = new CulturalEvents();
        TechnicalEvents TechnicalPosition = new TechnicalEvents();
        NonTechnicalEvents NonTechnicalPosition = new NonTechnicalEvents();

        Typeface faceHead = Typeface.createFromAsset(getAssets(), "fonts/fonteventdetails.ttf");
        Typeface faceContent = Typeface.createFromAsset(getAssets(), "fonts/contentfont.ttf");

        EventRulesFeader = (TextView) findViewById(R.id.EventRules);
        EventVenueHeader = (TextView) findViewById(R.id.EventVenueHeader);
        EventTimingHeader = (TextView) findViewById(R.id.EventTimingHeader);
        EventDateHeader = (TextView) findViewById(R.id.EventDateHeader);
        EventContactHeader = (TextView) findViewById(R.id.EventContactHeader);
        EventRegistratinFeesHeader = (TextView) findViewById(R.id.EventRegistartionFeesHeader);

        EventRule1 = (TextView) findViewById(R.id.Rule1);
        EventRule2 = (TextView) findViewById(R.id.Rule2);
        EventRule3 = (TextView) findViewById(R.id.Rule3);
        EventRule4 = (TextView) findViewById(R.id.Rule4);
        EventRule5 = (TextView) findViewById(R.id.Rule5);
        EventVenue = (TextView) findViewById(R.id.EventVenue);
        EventTime = (TextView) findViewById(R.id.EventTiming);
        EventDate = (TextView) findViewById(R.id.EventDate);
        Contact1 = (TextView) findViewById(R.id.contact1);
        Contact2 = (TextView) findViewById(R.id.contact2);
        EventRegistrationFees = (TextView) findViewById(R.id.EventRegistrationFees);


        EventRulesFeader.setTypeface(faceHead);
        EventVenueHeader.setTypeface(faceHead);
        EventTimingHeader.setTypeface(faceHead);
        EventDateHeader.setTypeface(faceHead);
        EventContactHeader.setTypeface(faceHead);
        EventRegistratinFeesHeader.setTypeface(faceHead);
                 //Technical Events
        //Hackathon(CSE)
        if (TechnicalPosition.Position == 0) {

            TechnicalPosition.Position=-1;
            CulturalPosition.Position=-1;
            NonTechnicalPosition.Position=-1;
            EventRule1.setTypeface(faceContent);
            EventRule1.setText("A]Coding:\n\n1] A team of 3-4 members can participate in this event.");
            EventRule2.setTypeface(faceContent);
            EventRule2.setText("2] Each team will be given a list of problem definitions and they have to code the solution in c/c++.");
            EventRule3.setTypeface(faceContent);
            EventRule3.setText("3] There is no limit for the each individual question.");
            EventRule4.setTypeface(faceContent);
            EventRule4.setText("4] The marks of the solved problems will be summed up at the end of the event to declare the winner.");
            EventRule5.setTypeface(faceContent);
            EventRule5.setText("B]App development:\n\n1] A team of 2-4 members will design an android app on theme 'Make in India' and judges will declare the winner.");
            EventVenue.setTypeface(faceContent);
            EventVenue.setText("Computer Labs");
            EventTime.setTypeface(faceContent);
            EventTime.setText("9PM to 9AM");
            EventDate.setTypeface(faceContent);
            EventDate.setText("11 March 2016");
            EventRegistrationFees.setTypeface(faceContent);
            EventRegistrationFees.setText("400 per Team");
            Contact1.setTypeface(faceContent);
            Contact1.setText("Vaibhav More\n+91 8861149838");
            Contact2.setTypeface(faceContent);
            Contact2.setText("Ashwini Munnolli\n91 8095322480");

        }
          //Technico Caza(CSE)
        if (TechnicalPosition.Position == 1) {
            TechnicalPosition.Position=-1;
            CulturalPosition.Position=-1;
            NonTechnicalPosition.Position=-1;
            EventRule1.setTypeface(faceContent);
            EventRule1.setText("1] Each team will consits of maximum 4 members.Atleast one member should have 3G/2G data.");
            EventRule2.setTypeface(faceContent);
            EventRule2.setText("2] Initially a hint or clue will be provided to all teams.");
            EventRule3.setTypeface(faceContent);
            EventRule3.setText("3]Each team has to solve the clue and reach the mentioned destination.");
            EventRule4.setTypeface(faceContent);
            EventRule4.setText("4] A technical group task will have to be completed by the team members in the alloted time failing which they will be eliminated.");
            EventRule5.setTypeface(faceContent);
            EventRule5.setText("5] The team successfully completing the task will be getting the next clue. ");
            EventVenue.setTypeface(faceContent);
            EventVenue.setText("MB 210 and MB 209");
            EventTime.setTypeface(faceContent);
            EventTime.setText("9AM to 1PM");
            EventDate.setTypeface(faceContent);
            EventDate.setText("11 and 12 MARCH 2016");
            EventRegistrationFees.setTypeface(faceContent);
            EventRegistrationFees.setText("300 per Team.");
            Contact1.setTypeface(faceContent);
            Contact1.setText("Janani\n+919886429734");
            Contact2.setTypeface(faceContent);
            Contact2.setText("Gangadhar Bilagi\n+91 8722617669");

        }
          //Civil War(Civil)
        if (TechnicalPosition.Position == 2)

        {
            TechnicalPosition.Position=-1;
            CulturalPosition.Position=-1;
            NonTechnicalPosition.Position=-1;
            EventRule1.setTypeface(faceContent);
            EventRule1.setText("1] Each team consists of two or four members.");
            EventRule2.setTypeface(faceContent);
            EventRule2.setText("2] The event consists of 3 rounds.");
            EventRule3.setTypeface(faceContent);
            EventRule3.setText("->Round 1:Screening\n\n* This is a Visual quiz round,where the participants are required to identify 60 famous civil engineering objects in 60 seconds.\n\n* The questions will be shown through a projector on screen.\n\n* Participants will be provided with a paper to write down answers.");
            EventRule4.setTypeface(faceContent);
            EventRule4.setText("->Round 2:Race for it\n\n* The participants who clears the first round will have to complete a set of given tasks in the given time.\n\n* 4 tasks have to be performed within 90 minutes.\n\n* it is a race among teams where tasks are to be performed back to back.");
            EventRule5.setTypeface(faceContent);
            EventRule5.setText("->Round 3:Mad AD\n\n* Top participants who clear round 2, will have to make an advertisement to market a civil engineering product.");
            EventVenue.setTypeface(faceContent);
            EventVenue.setText("CM 201");
            EventTime.setTypeface(faceContent);
            EventTime.setText("Full day");
            EventDate.setTypeface(faceContent);
            EventDate.setText("10th,11th and 12 March 2016");
            EventRegistrationFees.setTypeface(faceContent);
            EventRegistrationFees.setText("100 per Team");
            Contact1.setTypeface(faceContent);
            Contact1.setText("Mallika M Magdum\n+917411080229");
            Contact2.setTypeface(faceContent);
            Contact2.setText("Rahul r Nair\n+918147828921");

        }
        //Double trouble(Civil)
        if (TechnicalPosition.Position == 3)

        {
            TechnicalPosition.Position=-1;
            CulturalPosition.Position=-1;
            NonTechnicalPosition.Position=-1;
            EventRule1.setTypeface(faceContent);
            EventRule1.setText("1] Each team consists of two members.");
            EventRule2.setTypeface(faceContent);
            EventRule2.setText("2] The event consists of 3 rounds.");
            EventRule3.setTypeface(faceContent);
            EventRule3.setText("->Round 1:Screening\n\n* This round will comprise of aptitude test from which top 20 teams will be selected.");
            EventRule4.setTypeface(faceContent);
            EventRule4.setText("->Round 2:Treasure Hunt\n\n* This round comprise of technical based treasure hunt where in series of puzzles will be given to participants.\n\n* The team which finish the event first will get 6 marks and other teams will get the marks based on the time of completion.");
            EventRule5.setTypeface(faceContent);
            EventRule5.setText("->Round 3:Final round will be conducted at two levels.\n\n* In the first level participants will be given a list which will have all the information regarding location of different elements of the house with respect to vastu\n\n* The team which is able to include maximum number elements will be given 2 marks.\n\n* In the level team will be asked to propose the elevation for that structure the assessment for which will be based on the aesthetics of the building.");
            EventVenue.setTypeface(faceContent);
            EventVenue.setText("CM 202");
            EventTime.setTypeface(faceContent);
            EventTime.setText("Full day");
            EventDate.setTypeface(faceContent);
            EventDate.setText("10th,11th and 12 March 2016");
            EventRegistrationFees.setTypeface(faceContent);
            EventRegistrationFees.setText("100 per Team.");
            Contact1.setTypeface(faceContent);
            Contact1.setText("Vinay K\n+919964887299");
            Contact2.setTypeface(faceContent);
            Contact2.setText("Sangeeta\n+917204092036");

        }
        //Techno Gang(Mecchanical)
        if (TechnicalPosition.Position == 4)

        {
            TechnicalPosition.Position=-1;
            CulturalPosition.Position=-1;
            NonTechnicalPosition.Position=-1;
            EventRule1.setTypeface(faceContent);
            EventRule1.setText("1] Each team consists of 4 members.");
            EventRule2.setTypeface(faceContent);
            EventRule2.setText("2] The event consists of 3 rounds.");
            EventRule3.setTypeface(faceContent);
            EventRule3.setText("->Round 1 Mental Ability: It consists of general quiz to test your knowledge.");
            EventRule4.setTypeface(faceContent);
            EventRule4.setText("->Round 2 Creativity: In this round you need to show your creativity by making something out of waste.");
            EventRule5.setTypeface(faceContent);
            EventRule5.setText("->Round 3:Activity: Final round is a treasure hunt..");
            EventVenue.setTypeface(faceContent);
            EventVenue.setText("Mechanical Dept");
            EventTime.setTypeface(faceContent);
            EventTime.setText("Full Day");
            EventDate.setTypeface(faceContent);
            EventDate.setText("11th and 12 March 2016");
            EventRegistrationFees.setTypeface(faceContent);
            EventRegistrationFees.setText("200 per Team.");
           Contact1.setTypeface(faceContent);
           Contact1.setText("Chetan\n+918095353950");
           Contact2.setTypeface(faceContent);
            Contact2.setText("Vishwanath Dasar\n+918904411527");

        }
        //Death Race(Mechanical)
        if (TechnicalPosition.Position == 5)

        {
            TechnicalPosition.Position=-1;
            CulturalPosition.Position=-1;
            NonTechnicalPosition.Position=-1;
            EventRule1.setTypeface(faceContent);
            EventRule1.setText("1] Each team consists of 2 members.");
            EventRule2.setTypeface(faceContent);
            EventRule2.setText("2] Robot specification must be as follows.");
            EventRule3.setTypeface(faceContent);
            EventRule3.setText("->Robot size must be 12 x 12 x 9 (inches).");
            EventRule4.setTypeface(faceContent);
            EventRule4.setText("->Motor must be 300 RPM MAX.");
            EventRule5.setTypeface(faceContent);
            EventRule5.setText("->Power must be 12 V, 5A.");
            EventVenue.setTypeface(faceContent);
            EventVenue.setText("Garden opposite to Canara Bank");
            EventTime.setTypeface(faceContent);
            EventTime.setText("Full Day");
            EventDate.setTypeface(faceContent);
            EventDate.setText("11th and 12 March 2016");
            EventRegistrationFees.setTypeface(faceContent);
            EventRegistrationFees.setText("300 per Team.");
            Contact1.setTypeface(faceContent);
            Contact1.setText("Chetan\n+918095353950");
            Contact2.setTypeface(faceContent);
            Contact2.setText("Vishwanath Dasar\n+918904411527");

        }
        //Tycoons(E&c)
        if (TechnicalPosition.Position == 6)

        {
            TechnicalPosition.Position=-1;
            CulturalPosition.Position=-1;
            NonTechnicalPosition.Position=-1;
            EventRule1.setTypeface(faceContent);
            EventRule1.setText("1] Each team consists of maximum 4 members.");
            EventRule2.setTypeface(faceContent);
            EventRule2.setText("2] The event consists of 3 rounds.");
            EventRule3.setTypeface(faceContent);
            EventRule3.setText("->Round 1:Design thinking process and no elimination round.");
            EventRule4.setTypeface(faceContent);
            EventRule4.setText("->Round 2:Ideation and survey making more focused about the idea and selecting Best new ideas.");
            EventRule5.setTypeface(faceContent);
            EventRule5.setText("->Round 3:Final presentation and prototype if necessary and selecting best two ideas.");
            EventVenue.setTypeface(faceContent);
            EventVenue.setText("EC Class rooms");
            EventTime.setTypeface(faceContent);
            EventTime.setText("12.00 to 3.00pm");
            EventDate.setTypeface(faceContent);
            EventDate.setText("11th March 2016");
            EventRegistrationFees.setTypeface(faceContent);
            EventRegistrationFees.setText("200 per Team.");
            Contact1.setTypeface(faceContent);
            Contact1.setText("Makrand N\n+919986431788");
            Contact2.setTypeface(faceContent);
            Contact2.setText("Noor MD.Khan\n+919591593379");

        }
        //Crypto haunt(E&C)
        if (TechnicalPosition.Position == 7)

        {
            TechnicalPosition.Position=-1;
            CulturalPosition.Position=-1;
            NonTechnicalPosition.Position=-1;
            EventRule1.setTypeface(faceContent);
            EventRule1.setText("1] Each team consists of maximum 2 members.");
            EventRule2.setTypeface(faceContent);
            EventRule2.setText("2] The event consists of following rounds.");
            EventRule3.setTypeface(faceContent);
            EventRule3.setText("->Round 1: Survival of the Fittest.");
            EventRule4.setTypeface(faceContent);
            EventRule4.setText("->Round 2: Jigsaw puzzle.");
            EventRule5.setTypeface(faceContent);
            EventRule5.setText("->Round 3: Huntomania.\n\n->Round 4: Selfi-thok");
            EventVenue.setTypeface(faceContent);
            EventVenue.setText("Auditorium");
            EventTime.setTypeface(faceContent);
            EventTime.setText("11.30 to 12.30 pm");
            EventDate.setTypeface(faceContent);
            EventDate.setText("11th March 2016");
            EventRegistrationFees.setTypeface(faceContent);
            EventRegistrationFees.setText("100 per Team.");
            Contact1.setTypeface(faceContent);
            Contact1.setText("Amar Kadur\n+918147527746");
            Contact2.setTypeface(faceContent);
            Contact2.setText("Anand Chaple\n+918123684439");

        }
        //Techno Quiz
        if (TechnicalPosition.Position == 8)

        {
            TechnicalPosition.Position=-1;
            CulturalPosition.Position=-1;
            NonTechnicalPosition.Position=-1;
            EventRule1.setTypeface(faceContent);
           EventRule1.setText("1] Each team consists of maximum 4 members.");
         EventRule2.setTypeface(faceContent);
           EventRule2.setText("2] The event consists of following rounds.");
            EventRule3.setTypeface(faceContent);EventRule3.setText("->Round 1:APTITUDE\n\n* Questions will be based on 30%of all branches and remaining 70% will based on make in india concept.\n\n* Participants will be provided with a paper to write down the answers.");
            EventRule4.setTypeface(faceContent);
            EventRule4.setText("->Round 2:MESS WITH BEST\n\nA]RAPID FIRE:Set of question will be asked, where participants are required to answer with in 10 seconds.\n\nB]BUZZER ROUND:Set of questions will be asked to the all participants, which team press the buzzer first will be given chance to answer");
            EventRule5.setTypeface(faceContent);
            EventRule5.setText("->Round 3:\n\nA]VIDEO ROUND:This is visual round ,where participants are required to identify the clip within 45 seconds.\n\nB]PICK N SPEAK:Here the participants are need to pick and speak about the topic which are assigned to them (make in india).\n\nC]PUZZLE ROUND:A set of puzzle will be given to top 2 participants, where they need to join them.");
            EventVenue.setTypeface(faceContent);
            EventVenue.setText("MB 001");
            EventTime.setTypeface(faceContent);
            EventTime.setText("11.00 AM to 1.00 PM");
            EventDate.setTypeface(faceContent);
            EventDate.setText("11th and 12th March 2016");
            EventRegistrationFees.setTypeface(faceContent);
            EventRegistrationFees.setText("200 per Team.");
            Contact1.setTypeface(faceContent);
            Contact1.setText("Bhagirathi\n+918050658014");
            //     Contact2.setTypeface(faceContent);
       //     Contact2.setText("Anand Chaple\n+918123684439");

        }
        //Tech Fuza(Bio Medical)
        if (TechnicalPosition.Position == 9)

        {
            TechnicalPosition.Position=-1;
            CulturalPosition.Position=-1;
            NonTechnicalPosition.Position=-1;
            EventRule1.setTypeface(faceContent);
            EventRule1.setText("->Round 1:\n\n* This will be a audio round\n\n* Here the teams will be shown a common video related to a product or a company and will be asked question based on it later.");
            EventRule2.setTypeface(faceContent);
            EventRule2.setText("->Round 2:\n\n* It is a puzzle round\n\n* Here the teams will be given puzzles of the components which they will have to arrange correctly.\n\n* The teams will then be asked questions about the video shown to them earlier.");
            EventRule3.setTypeface(faceContent);
            EventRule3.setText("->Round 3:\n\n* Here members are allowed to assemble the parts given to them within certain time period.");
            EventRule4.setTypeface(faceContent);
            EventRule4.setText("->Top team will be declared as winners.");
            EventRule5.setTypeface(faceContent);
            EventRule5.setText("Judges decision is the final");
            EventVenue.setTypeface(faceContent);
            EventVenue.setText("MB 207,MB 208");
           EventTime.setTypeface(faceContent);
            EventTime.setText("9.30Am to 10.30AM");
            EventDate.setTypeface(faceContent);
            EventDate.setText("11th March 2016");
            EventRegistrationFees.setTypeface(faceContent);
            EventRegistrationFees.setText("225 per Team.");Contact1.setTypeface(faceContent);
            Contact1.setText("Anup\n+919901927374");
            Contact2.setTypeface(faceContent);
            Contact2.setText("Karan\n+919538480220");

        }
        //Biz-wiz(Bio Medical)
        if (TechnicalPosition.Position == 10)

        {
            TechnicalPosition.Position=-1;
            CulturalPosition.Position=-1;
            NonTechnicalPosition.Position=-1;
            EventRule1.setTypeface(faceContent);
            EventRule1.setText("1] Each team will have maximum 3 participants.");
            EventRule2.setTypeface(faceContent);
            EventRule2.setText("2] Teams will be given some virtual money.");
            EventRule3.setTypeface(faceContent);
            EventRule3.setText("3] A common theme will be given and teams will have to bid for materials using their virtual money.");
            EventRule4.setTypeface(faceContent);
            EventRule4.setText("4] The teams will convince the judges to buy their products where the judges will act as virtual market.");
            EventRule5.setTypeface(faceContent);
            EventRule5.setText("5] The team making maximum profit wins.");
            EventVenue.setTypeface(faceContent);
            EventVenue.setText("LD Lab");
            EventTime.setTypeface(faceContent);
            EventTime.setText("9.30am to 12.30pm");
            EventDate.setTypeface(faceContent);
            EventDate.setText("11th March 2016");
            EventRegistrationFees.setTypeface(faceContent);
            EventRegistrationFees.setText("225 per Team.");
            Contact1.setTypeface(faceContent);
            Contact1.setText("Chandana\n+917204450458");
            Contact2.setTypeface(faceContent);
            Contact2.setText("Tejasvi\n+919980572727");

        }
        //Micro Byte(Telecome)
        if (TechnicalPosition.Position == 11)

        {
            TechnicalPosition.Position=-1;
            CulturalPosition.Position=-1;
            NonTechnicalPosition.Position=-1;
            EventRule1.setTypeface(faceContent);
            EventRule1.setText("1] Each team will have maximum 2 participants.");
            EventRule2.setTypeface(faceContent);
            EventRule2.setText("2] It is a microcontroller coding event which tests students knowledge and coding skills on microcontroller.");
            EventRule3.setTypeface(faceContent);
            EventRule3.setText("3] The Event comprises of 3 rounds.");
            EventRule4.setTypeface(faceContent);
            EventRule4.setText("->Round 1:MCQ’s on microcontroller architecture, instructions and so on.");
            EventRule5.setTypeface(faceContent);
            EventRule5.setText("->Round 2:Code debugging.\n\n->Round 3:Microcontroller coding for a given program statement.");
            EventVenue.setTypeface(faceContent);
            EventVenue.setText("MB 105");
            EventTime.setTypeface(faceContent);
            EventTime.setText("11.00am to 3.00 pm");
            EventDate.setTypeface(faceContent);
            EventDate.setText("11th March 2016");
            EventRegistrationFees.setTypeface(faceContent);
            EventRegistrationFees.setText("150 per team and 100 per participant.");
            Contact1.setTypeface(faceContent);
            Contact1.setText("Suja\n+919632182565");
            //Contact2.setTypeface(faceContent);
           // Contact2.setText("Tejasvi Ghanta\n+919980572727");

        }
        //Electronic Puzzle(Telecom)
        if (TechnicalPosition.Position == 12)

        {
            TechnicalPosition.Position=-1;
            CulturalPosition.Position=-1;
            NonTechnicalPosition.Position=-1;
            EventRule1.setTypeface(faceContent);
            EventRule1.setText("1] Each team will have maximum 2 participants.");
            EventRule2.setTypeface(faceContent);
            EventRule2.setText("Round A:\n\n30 MCQ's based on electronics");
            EventRule3.setTypeface(faceContent);
            EventRule3.setText("Round B:\n\nQualified teams will be given with puzzle wherein the team has to complete the puzzle as per the pattern allocated them and glow the LED placed on the puzzle board in minimum time.");
            EventRule4.setTypeface(faceContent);
            EventRule4.setText("Round C:\n\nQualified team of round 2 will be given with another puzzle and should be completed in minimum time.");
            EventVenue.setTypeface(faceContent);
            EventVenue.setText("MB 105 and MB 103");
            EventTime.setTypeface(faceContent);
            EventTime.setText("11.00am to 3.00 pm");
            EventDate.setTypeface(faceContent);
            EventDate.setText("11th and 12th March 2016");
            EventRegistrationFees.setTypeface(faceContent);
            EventRegistrationFees.setText("150 per team.");
            Contact1.setTypeface(faceContent);
            Contact1.setText("Anjali\n+917411971749");
          //  Contact2.setTypeface(faceContent);
          //  Contact2.setText("Tejasvi Ghanta\n+919980572727");

        }
        //Crime Scene Investigation(Bio-Tech)
        if (TechnicalPosition.Position == 13)
        {
            TechnicalPosition.Position=-1;
            CulturalPosition.Position=-1;
            NonTechnicalPosition.Position=-1;
            EventRule1.setTypeface(faceContent);
            EventRule1.setText("1] The game is divided into 2 rounds.");
            EventRule2.setTypeface(faceContent);
            EventRule2.setText("2] In the first round the investigators(players) have to crack puzzles and complete the task in least time.");
            EventRule3.setTypeface(faceContent);
            EventRule3.setText("3] Participants qualifying the first round will be moved to the second round.");
            EventRule4.setTypeface(faceContent);
            EventRule4.setText("4] In the second round , the CSI game players assume the role of crime scene investigators to gather evidence from different crime scenes and Unfold the mystery.");
            EventVenue.setTypeface(faceContent);
            EventVenue.setText("MB-204 and MB-205");
            EventTime.setTypeface(faceContent);
            EventTime.setText("11.00am to 5.00 pm");
            EventDate.setTypeface(faceContent);
            EventDate.setText("11th and 12th March 2016");
            EventRegistrationFees.setTypeface(faceContent);
            EventRegistrationFees.setText("300 per team.");
            Contact1.setTypeface(faceContent);
            Contact1.setText("Neha A\n8050367550");
              Contact2.setTypeface(faceContent);
              Contact2.setText("Anusha S\n+917676989737");

        }
        //Bio Modelling(Bio Tech)
        if (TechnicalPosition.Position == 14)
        {
            TechnicalPosition.Position=-1;
            CulturalPosition.Position=-1;
            NonTechnicalPosition.Position=-1;
            EventRule1.setTypeface(faceContent);
            EventRule1.setText("1] Each team will have minimum 2 and maximum 4 participants.");
            EventRule2.setTypeface(faceContent);
            EventRule2.setText("2] Maximum materials used should be naturally available products (e.g. plant products, sand, shells, etc.).");
            EventRule3.setTypeface(faceContent);
            EventRule3.setText("3] All the required materials should be brought by the participants.");
            EventRule4.setTypeface(faceContent);
            EventRule4.setText("4] Judges decision will be final.");
            EventVenue.setTypeface(faceContent);
            EventVenue.setText("MB204");
            EventTime.setTypeface(faceContent);
            EventTime.setText("11.00 am – 3.00pm");
            EventDate.setTypeface(faceContent);
            EventDate.setText("12th March 2016");
            EventRegistrationFees.setTypeface(faceContent);
            EventRegistrationFees.setText("50 per participant.");
            Contact1.setTypeface(faceContent);
            Contact1.setText("Akshata G\n+919620337629");
            //  Contact2.setTypeface(faceContent);
            //  Contact2.setText("Tejasvi Ghanta\n+919980572727");

        }
        //Pratikriti(Chemical)
        if (TechnicalPosition.Position == 15)
        {
            TechnicalPosition.Position=-1;
            CulturalPosition.Position=-1;
            NonTechnicalPosition.Position=-1;
            EventRule1.setTypeface(faceContent);
            EventRule1.setText("1] Each team will have minimum 2 participants.");
            EventRule2.setTypeface(faceContent);
            EventRule2.setText("2] Time limit for preparing the model is 4 hours.");
            EventRule3.setTypeface(faceContent);
            EventRule3.setText("3] Models should be according to the themes given.");
            EventRule4.setTypeface(faceContent);
            EventRule4.setText("4] Basic materials like scissor, cello tapes will be provided for the making of the model.");
            EventRule5.setTypeface(faceContent);
            EventRule5.setText("5] Any additional Material can be brought.");
            EventVenue.setTypeface(faceContent);
            EventVenue.setText("MB204");
            EventTime.setTypeface(faceContent);
            EventTime.setText("11.00 am – 2.00pm");
            EventDate.setTypeface(faceContent);
            EventDate.setText("12th March 2016");
            EventRegistrationFees.setTypeface(faceContent);
            EventRegistrationFees.setText("50 per participant.");
            Contact1.setTypeface(faceContent);
            Contact1.setText("Siddharth Vaidya\n+919591097965");
            //  Contact2.setTypeface(faceContent);
            //  Contact2.setText("Tejasvi Ghanta\n+919980572727");

        }
        //Akriti(Chemical)

        if (TechnicalPosition.Position == 16)

        {
            TechnicalPosition.Position=-1;
            CulturalPosition.Position=-1;
            NonTechnicalPosition.Position=-1;
            EventRule1.setTypeface(faceContent);
            EventRule1.setText("1] A team consists of maximum 3 members in a group.");
            EventRule2.setTypeface(faceContent);
            EventRule2.setText("2] Poster should be prepared within the domains given.");
            EventRule3.setTypeface(faceContent);
            EventRule3.setText("3] Each team has to present the details of poster for 5 min.");
            EventRule4.setTypeface(faceContent);
            EventRule4.setText("4] Judges decision is final.");
            EventRule5.setTypeface(faceContent);
            EventRule5.setText("5] Make in India concept apply to \na]Biotechnology and Nanotechnology\nb]Energy Management\nc]Green Technology and Environment\nd]Modelling and Simulation\ne]Seperation Technics");
            EventVenue.setTypeface(faceContent);
            EventVenue.setText("MB 201, MB 202");
            EventTime.setTypeface(faceContent);
            EventTime.setText("Full Day");
            EventDate.setTypeface(faceContent);
            EventDate.setText("11 MARCH 2016");
            EventRegistrationFees.setTypeface(faceContent);
            EventRegistrationFees.setText("50 per participant.");
            Contact1.setTypeface(faceContent);
            Contact1.setText("Mr Devadatt Thengadi\n+919986540438");
           // Contact2.setTypeface(faceContent);
           // Contact2.setText("Gangadhar Bilagi\n+91 8722617669");

        }
        //Ad-Mime(MBA)
        if (TechnicalPosition.Position == 17)

        {
            TechnicalPosition.Position=-1;
            CulturalPosition.Position=-1;
            NonTechnicalPosition.Position=-1;
            EventRule1.setTypeface(faceContent);
            EventRule1.setText("1] A team consists of minimum 2 or maximum 4 members in a group.");
            EventRule2.setTypeface(faceContent);
            EventRule2.setText("2] The Themes will be as follows.");
            EventRule3.setTypeface(faceContent);
            EventRule3.setText("3] *Make in India.\n\n*Farmers’ suicide.\n\n*Old age.\n\n*Men harassment.\n\n*Graduation life.");
            EventRule4.setTypeface(faceContent);
            EventRule4.setText("4] Time limit is 5 Mins(4min+1min).");
            // EventRule5.setTypeface(faceContent);
            // EventRule5.setText("5] The team successfully completing the task will be getting the next clue. ");
            EventVenue.setTypeface(faceContent);
            EventVenue.setText("Portico backend Ground");
            EventTime.setTypeface(faceContent);
            EventTime.setText("10.00 AM to 2.00 PM");
            EventDate.setTypeface(faceContent);
            EventDate.setText("11 MARCH 2016");
            EventRegistrationFees.setTypeface(faceContent);
            EventRegistrationFees.setText("100 per participant.");
            Contact1.setTypeface(faceContent);
           Contact1.setText("Keerti Kulakarni\n+919481008833");
            // Contact2.setTypeface(faceContent);
            // Contact2.setText("Gangadhar Bilagi\n+91 8722617669");

        }
        //Just for Fun(MBA)
        if (TechnicalPosition.Position == 18)

        {
            TechnicalPosition.Position=-1;
            CulturalPosition.Position=-1;
            NonTechnicalPosition.Position=-1;
            EventRule1.setTypeface(faceContent);
            EventRule1.setText("1] A team consists of minimum 2 or maximum 5 members in a group.");
            EventRule2.setTypeface(faceContent);
            EventRule2.setText("2] The Theme of the event is Prank.");
            EventRule3.setTypeface(faceContent);
            EventRule3.setText("3] Time allotted is 2 min.");
            EventRule4.setTypeface(faceContent);
            EventRule4.setText("4] Team members participating in the event should also be a part of the gags and should be seen in the video.");
             EventRule5.setTypeface(faceContent);
             EventRule5.setText("5] No vulgarity.");
          EventVenue.setTypeface(faceContent);
           EventVenue.setText("Saptrishi hall");
           EventTime.setTypeface(faceContent);
            EventTime.setText("11.00 AM to 2.00 PM");
            EventDate.setTypeface(faceContent);
          EventDate.setText("12 March 2016");
           EventRegistrationFees.setTypeface(faceContent);
           EventRegistrationFees.setText("100 per participant.");
              Contact1.setTypeface(faceContent);
               Contact1.setText("Aditya\n+919967822449");
            // Contact2.setTypeface(faceContent);
            // Contact2.setText("Gangadhar Bilagi\n+91 8722617669");

        }
        //Encrypt(MCA)
        if (TechnicalPosition.Position == 19)
        {
            TechnicalPosition.Position=-1;
            CulturalPosition.Position=-1;
            NonTechnicalPosition.Position=-1;
            EventRule1.setTypeface(faceContent);
            EventRule1.setText("1] A team consists of maximum 2 members in a group.");
            EventRule2.setTypeface(faceContent);
            EventRule2.setText("2] The event will test the programming ability of members of the teams.");
            EventRule3.setTypeface(faceContent);
            EventRule3.setText("3] The teams will be put through a brain storming half an hour preliminary round.");
            EventRule4.setTypeface(faceContent);
            EventRule4.setText("4] The top four teams will be selected for the finals.\n\n5] In the finals the teams will be given a requirements to program.");
             EventRule5.setTypeface(faceContent);
             EventRule5.setText("6] The team which have the most efficient program and most debugged programs walks away with honor. ");
            EventVenue.setTypeface(faceContent);
            EventVenue.setText("MCA Lab");
            EventTime.setTypeface(faceContent);
            EventTime.setText("Time: 10 am to 2pm");
            EventDate.setTypeface(faceContent);
            EventDate.setText("11/03/2016");
            EventRegistrationFees.setTypeface(faceContent);
            EventRegistrationFees.setText("100 per team.");
            Contact1.setTypeface(faceContent);
            Contact1.setText("Yunus\n+918792495136");
            //Contact2.setTypeface(faceContent);
            // Contact2.setText("Gangadhar Bilagi\n+91 8722617669");

        }
        //Minute to win(MCA)
        if (TechnicalPosition.Position == 20)
        {
            TechnicalPosition.Position=-1;
            CulturalPosition.Position=-1;
            NonTechnicalPosition.Position = -1;
            EventRule1.setTypeface(faceContent);
            EventRule1.setText("1] A team consists of maximum 2 members in a group.");
            EventRule2.setTypeface(faceContent);
            EventRule2.setText("2] Based on given theme participants need to make a power-point presentation.");
            EventRule3.setTypeface(faceContent);
            EventRule3.setText("3] Presentations usually last 8-10.");
            EventRule4.setTypeface(faceContent);
            EventRule4.setText("4] 10 slides are the optimal number. ");
            EventRule5.setTypeface(faceContent);
            EventRule5.setText("4] Internet will be provided.");
            EventVenue.setTypeface(faceContent);
             EventVenue.setText("MCA Lab");
             EventTime.setTypeface(faceContent);
             EventTime.setText("Time: 10 am to 2 pm");
             EventDate.setTypeface(faceContent);
            EventDate.setText("12/03/2016");
            EventRegistrationFees.setTypeface(faceContent);
            EventRegistrationFees.setText("50 per participant.");
               Contact1.setTypeface(faceContent);
             Contact1.setText("Sachin\n+919008879008");
            // Contact2.setTypeface(faceContent);
            // Contact2.setText("Gangadhar Bilagi\n+91 8722617669");

        }
        //Non Technical Events
        //1]Scary House
        if (NonTechnicalPosition.Position == 0)

        {
            TechnicalPosition.Position=-1;
            CulturalPosition.Position=-1;
            NonTechnicalPosition.Position=-1;
            EventRule1.setTypeface(faceContent);
            EventRule1.setText("1] It will comprise of various props.");
            EventRule2.setTypeface(faceContent);
            EventRule2.setText("2] It will also include tasks tobe performed which will be given in the form of clues.");
            EventRule3.setTypeface(faceContent);
            EventRule3.setText("3] All the characters are being played by the student volunteers.");
            EventRule4.setTypeface(faceContent);
            EventRule4.setText("4] It will be adventurous and the thrill of the event will be maintained throughout the fest.");
          //  EventRule5.setTypeface(faceContent);
           // EventRule5.setText("5] Paint Ball: 1] It is the Final round for the Counter Strike.\n 2] The two teams who clears the counter strike will go to final round of painting wall. ");
            EventVenue.setTypeface(faceContent);
            EventVenue.setText("Table Tennis Hall");
            EventTime.setTypeface(faceContent);
            EventTime.setText("Full Day");
            EventDate.setTypeface(faceContent);
            EventDate.setText("10th ,11th and 12th MARCH 2016");
            EventRegistrationFees.setTypeface(faceContent);
            EventRegistrationFees.setText("150 per 3 members\n\n100 per 2 people\n\n60 per single person");
            Contact1.setTypeface(faceContent);
            Contact1.setText("Bheemaraj Mali\n7795878343");
       //     Contact2.setTypeface(faceContent);
        //    Contact2.setText("Bheemraj Mali\n");

        }
        //Mecho Marketing
        if (NonTechnicalPosition.Position == 1)

        {
            TechnicalPosition.Position=-1;
            CulturalPosition.Position=-1;
            NonTechnicalPosition.Position=-1;
            EventRule1.setTypeface(faceContent);
            EventRule1.setText("1] The event consists of a team of 4 members.");
            EventRule2.setTypeface(faceContent);
            EventRule2.setText("2] Location is fixed( participants not to cross the specified location).");
            EventRule3.setTypeface(faceContent);
            EventRule3.setText("3] No mobiles and wallets allowed to carry during the event.");
            EventRule4.setTypeface(faceContent);
            EventRule4.setText("4] Organizing committee  will accompany to check for any mal practice.");
              EventRule5.setTypeface(faceContent);
             EventRule5.setText("5] A fixed sum will be deducted from the total amount earned.");
            EventVenue.setTypeface(faceContent);
           EventVenue.setText("Mech Dept");
            EventTime.setTypeface(faceContent);
            EventTime.setText("Full Day");
            EventDate.setTypeface(faceContent);
            EventDate.setText("11th and 12th MARCH 2016");
            EventRegistrationFees.setTypeface(faceContent);
            EventRegistrationFees.setText("200 per team");
            Contact1.setTypeface(faceContent);
            Contact1.setText("Chetan\n+918095353950");
            Contact2.setTypeface(faceContent);
            Contact2.setText("Vishwanath Dasar\n+918904411527");

        }
        //Ludus Thronis(E&C)
        if (NonTechnicalPosition.Position == 2)

        {
            TechnicalPosition.Position=-1;
            CulturalPosition.Position=-1;
            NonTechnicalPosition.Position=-1;
            EventRule1.setTypeface(faceContent);
            EventRule1.setText("1] The event consists of a team of 4 members.");
            EventRule2.setTypeface(faceContent);
            EventRule2.setText("2] This has following rounds.");
            EventRule3.setTypeface(faceContent);
            EventRule3.setText("->Survival of the fittest.");
            EventRule4.setTypeface(faceContent);
            EventRule4.setText("->Jigsaw puzzle.");
            EventRule5.setTypeface(faceContent);
            EventRule5.setText("->Huntomania.\n\n->Selfithok.");
              EventVenue.setTypeface(faceContent);
              EventVenue.setText("College ground.");
            EventTime.setTypeface(faceContent);
            EventTime.setText("11.30am ");
            EventDate.setTypeface(faceContent);
            EventDate.setText("11th and 12th MARCH 2016");
            EventRegistrationFees.setTypeface(faceContent);
            EventRegistrationFees.setText("200 per team");
              Contact1.setTypeface(faceContent);
               Contact1.setText("Prajakta\n9886511392");
               Contact2.setTypeface(faceContent);
               Contact2.setText("Anudeep\n8951830314");

        }
        //Clash of Lans(CSE)
        if (NonTechnicalPosition.Position == 3)

        {
            TechnicalPosition.Position=-1;
            CulturalPosition.Position=-1;
            NonTechnicalPosition.Position=-1;
            EventRule1.setTypeface(faceContent);
            EventRule1.setText("1] The event has 3 games.");
                    EventRule2.setTypeface(faceContent);
            EventRule2.setText("->Game 1:NFS Most Wanted\n" +
                    "\n" +
                    "i)No. of participant is 1.\n" +
                    "\n" +
                    "ii)Single player will compete with 3 others.\n" +
                    "\n" +
                    "iii)Winner of 1st round goes to further rounds.\n" +
                    "\n" +
                    "iv)Final round will be between 2 players.\"");
            EventRule3.setTypeface(faceContent);
            EventRule3.setText("->Game 2:FIFA\n\ni)No.of participant is 1.\n\nii)Two players will be playing against each other.\n\niii)Winner of 1st round goes to further rounds.\n\niv)Final round will be between 2 players.");
            EventRule4.setTypeface(faceContent);
            EventRule4.setText("->Game 3:Counter Strike\n\ni)No.of participants: 4 in a team.\n\nii)Two teams will be playing against each other.\n\niii)Winning team of 1st round goes to further rounds.\n\niv)Final round will be between 2 teams.");
          //  EventRule5.setTypeface(faceContent);
           // EventRule5.setText("->Blind fold and find misplaced outfits.\n\n->Dubmash and selfie challenge");
            EventVenue.setTypeface(faceContent);
            EventVenue.setText("Lab3,Lab2 and MB 110.");
            EventTime.setTypeface(faceContent);
            EventTime.setText("9AM to 5PM");
            EventDate.setTypeface(faceContent);
            EventDate.setText("11th and 12th MARCH 2016");
            EventRegistrationFees.setTypeface(faceContent);
            EventRegistrationFees.setText("NFS: 50.00 per head\n\nFIFA: 50.00 per head\n\nCounter Strike: 200.00");
            Contact1.setTypeface(faceContent);
            Contact1.setText("Gurudas\n9035347395");
            Contact2.setTypeface(faceContent);
            Contact2.setText("Sanket\n8147314070");

        }
        //Dare to Win(E&E)
        if (NonTechnicalPosition.Position == 4)

        {
            TechnicalPosition.Position=-1;
            CulturalPosition.Position=-1;
            NonTechnicalPosition.Position=-1;
             EventRule1.setTypeface(faceContent);
                EventRule1.setText("1] The event consists of a team of 2 members.");
                EventRule2.setTypeface(faceContent);
              EventRule2.setText("2] There will be set of games given to the participants,among them they have to choose any one and they have to play game in one minute.");
                EventRule3.setTypeface(faceContent);
            EventRule3.setText("3] In 2nd round participants will be given sack and by wearing the sack they have to run and best of them will qualified for the next round.");
            EventRule4.setTypeface(faceContent);
            EventRule4.setText("4] A Hockey stick and a ball will be given to the finalists,they have to carry the ball along the track with the stick and best performer will be the winner.");
           // EventRule5.setTypeface(faceContent);
           //       EventRule5.setText("->Blind fold and find misplaced outfits.\n\n->Dubmash and selfie challenge");
            EventVenue.setTypeface(faceContent);
            EventVenue.setText("College ground and Central portico.");
            EventTime.setTypeface(faceContent);
            EventTime.setText("10.00AM to 5.00PM");
            EventDate.setTypeface(faceContent);
            EventDate.setText("11th and 12th MARCH 2016");
             EventRegistrationFees.setTypeface(faceContent);
            EventRegistrationFees.setText("100 per team");
            Contact1.setTypeface(faceContent);
           Contact1.setText("Vinayak\n9663137322");
          //  Contact2.setTypeface(faceContent);
        //    Contact2.setText("Sanket\n8147314070");

        }
        //Lucky Ladder(BioMedical)
        if (NonTechnicalPosition.Position == 5)
        {
            TechnicalPosition.Position=-1;
            CulturalPosition.Position=-1;
            NonTechnicalPosition.Position=-1;
                  EventRule1.setTypeface(faceContent);
                     EventRule1.setText("1] The event consists of a team of 2 members.");
                    EventRule2.setTypeface(faceContent);
                 EventRule2.setText("2] It is a non technical event which is same as snake and ladder (Full 2days).");
            EventRule3.setTypeface(faceContent);
           // EventRule3.setText(".");
        //    EventRule4.setTypeface(faceContent);
         //            EventRule4.setText("");
         //   EventRule5.setTypeface(faceContent);
         //   EventRule5.setText("->Blind fold and find misplaced outfits.\n\n->Dubmash and selfie challenge");
            EventVenue.setTypeface(faceContent);
            EventVenue.setText("Apple Garden.");
            EventTime.setTypeface(faceContent);
         EventTime.setText("10am to 5pm");
           EventDate.setTypeface(faceContent);
            EventDate.setText("11th and 12th MARCH 2016");
              EventRegistrationFees.setTypeface(faceContent);
             EventRegistrationFees.setText("150 for pair");
                Contact1.setTypeface(faceContent);
               Contact1.setText("Chetan\n7411807890");
              Contact2.setTypeface(faceContent);
                Contact2.setText("Sanjana\n9538367060");

        }
        //Guid and Grab(Telecom)
        if (NonTechnicalPosition.Position == 6)

        {
            TechnicalPosition.Position=-1;
            CulturalPosition.Position=-1;
            NonTechnicalPosition.Position=-1;
            EventRule1.setTypeface(faceContent);
            EventRule1.setText("1] The event consists of a team of 2 members.");
            EventRule2.setTypeface(faceContent);
            EventRule2.setText("2] One Player will be blindfold and the other players hands will be locked.");
            EventRule3.setTypeface(faceContent);
            EventRule3.setText("3] The key will same colour for respective lock is placed with other keys.");
            EventRule4.setTypeface(faceContent);
            EventRule4.setText("4] Blindfold player should get the key According to guidance of the other player and unlock their patner.");
            EventRule5.setTypeface(faceContent);
            EventRule5.setText("5] 6 Teams play the game simultaneously and the 1st to unlock is awarded.");
            EventVenue.setTypeface(faceContent);
            EventVenue.setText("In the middle of garder.");
            EventTime.setTypeface(faceContent);
            EventTime.setText("Full day");
            EventDate.setTypeface(faceContent);
            EventDate.setText("10th,11th,12th MARCH 2016");
            EventRegistrationFees.setTypeface(faceContent);
            EventRegistrationFees.setText("100 per Team");
                Contact1.setTypeface(faceContent);
               Contact1.setText("Adarsh\n9632719119");
              Contact2.setTypeface(faceContent);
                Contact2.setText("Aquib\n8147660162");

        }
        //Lagori(Bio Tech)
        if (NonTechnicalPosition.Position == 7)

        {
            TechnicalPosition.Position=-1;
            CulturalPosition.Position=-1;
            NonTechnicalPosition.Position=-1;
            EventRule1.setTypeface(faceContent);
            EventRule1.setText("1] The event consists of a team of 4 members.");
            EventRule2.setTypeface(faceContent);
            EventRule2.setText("2] A coin is tossed to select which team takes the attacking role first.");
            EventRule3.setTypeface(faceContent);
            EventRule3.setText("3] The defending team player can only pivot with the ball and not move around. The maximum time the player is permitted to have the ball in his hands is about 20 seconds. He has to pass the ball to other members of his team who will attempt the same – to make a player that they are marking ‘out’ by hitting their body part with a ball. People with the ball, however can dodge.");
            EventRule4.setTypeface(faceContent);
            EventRule4.setText("4] The stones have to fall within the circle only. If they fall outside the circle, then its again 1 point for the defending team plus they get to throw the ball now.");
            EventRule5.setTypeface(faceContent);
            EventRule5.setText("5] If any defending team player catches the ball after it has touched the pile of stones and before it has bounced, then they get 1 point and the teams interchange places.\n\n6] The player of the attacking team can shield himself from the ball, by hitting it away from the main area, so that time is wasted when the opposing team player fetches it from far away.\n\n 7] The time for each game is 15 min.");
            EventVenue.setTypeface(faceContent);
            EventVenue.setText("College Ground(Near Basket Ball area.");
            EventTime.setTypeface(faceContent);
            EventTime.setText("11.00am to 4.00pm");
            EventDate.setTypeface(faceContent);
            EventDate.setText("12th  MARCH 2016");
            EventRegistrationFees.setTypeface(faceContent);
            EventRegistrationFees.setText("200 per team");
            Contact1.setTypeface(faceContent);
            Contact1.setText("Sahana H\n7795731405");
            Contact2.setTypeface(faceContent);
                Contact2.setText("Varad P\n8050253199");

        }
        //Tuk Tuk Ghoda(Chemical)
        if (NonTechnicalPosition.Position == 8)
        {
            TechnicalPosition.Position=-1;
            CulturalPosition.Position=-1;
            NonTechnicalPosition.Position=-1;
            EventRule1.setTypeface(faceContent);
            EventRule1.setText("1] The event consists a team of 4 members.");
            EventRule2.setTypeface(faceContent);
            EventRule2.setText("2] Plank race is of 100 meters.");
            EventRule3.setTypeface(faceContent);
            EventRule3.setText("3] Planks will be given.");
            EventRule4.setTypeface(faceContent);
            EventRule4.setText("4] Feet will be straped to the planks.");
         //   EventRule5.setTypeface(faceContent);
          //  EventRule5.setText("5] If any defending team player catches the ball after it has touched the pile of stones and before it has bounced, then they get 1 point and the teams interchange places.\n\n6] The player of the attacking team can shield himself from the ball, by hitting it away from the main area, so that time is wasted when the opposing team player fetches it from far away.\n\n 7] The time for each game is 15 min.");
            EventVenue.setTypeface(faceContent);
            EventVenue.setText("Portico.");
            EventTime.setTypeface(faceContent);
            EventTime.setText("10.00 AM");
            EventDate.setTypeface(faceContent);
            EventDate.setText("11th MARCH 2016");
              EventRegistrationFees.setTypeface(faceContent);
             EventRegistrationFees.setText("50 per participant");
            Contact1.setTypeface(faceContent);
            Contact1.setText("Mustafa\n8147311989");
            //  Contact2.setTypeface(faceContent);
            //    Contact2.setText("Sanket\n8147314070");

        }
        //Vegetable(MBA)
        if (NonTechnicalPosition.Position == 9) {
            TechnicalPosition.Position = -1;
            CulturalPosition.Position = -1;
            NonTechnicalPosition.Position = -1;
            EventRule1.setTypeface(faceContent);
          EventRule1.setText("1] The event consists of a team of 3 members.");
         EventRule2.setTypeface(faceContent);
          EventRule2.setText("2] Vegetables and fruits to be brought by participants.");
            EventRule3.setTypeface(faceContent);
          EventRule3.setText("3] Knife, Serving plates, trays or any other preparation or presentation stuff to be brought by the participants.");
         EventRule4.setTypeface(faceContent);
          EventRule4.setText("4] Preparation without heating (No heating).");
               EventRule5.setTypeface(faceContent);
              EventRule5.setText("5] No readymade stuff.\n\n6] Preparations to be done right during the competition.");
         EventVenue.setTypeface(faceContent);
            EventVenue.setText("MBA block, 4th floor.");
           EventTime.setTypeface(faceContent);
          EventTime.setText("10.00 AM to 2.00PM");
           EventDate.setTypeface(faceContent);
          EventDate.setText("11 March 2016");
            EventRegistrationFees.setTypeface(faceContent);
            EventRegistrationFees.setText("50 per participant");
            Contact1.setTypeface(faceContent);
            Contact1.setText("Pallavi\n7353429903");
            //  Contact2.setTypeface(faceContent);
        }
        //Minute to Win(MCA)
        if (NonTechnicalPosition.Position == 10)
        {
            TechnicalPosition.Position=-1;
            CulturalPosition.Position = -1;
            NonTechnicalPosition.Position = -1;
            EventRule1.setTypeface(faceContent);
            EventRule1.setText("1] It comprises of two games.");
            EventRule2.setTypeface(faceContent);
            EventRule2.setText("->Head to Head");
            EventRule3.setTypeface(faceContent);
            EventRule3.setText("*Two players compete simultaneously in the same challenges in a best of 3 Battle Royale");
            EventRule4.setTypeface(faceContent);
            EventRule4.setText("->LAST MAN STANDING");
            EventRule5.setTypeface(faceContent);
            EventRule5.setText("*5 Players compete at the same time in group. At the end of each round, the person who finished last is eliminated, until one surviving player is declared “Last Man Standing”");
            EventVenue.setTypeface(faceContent);
            EventVenue.setText("*Between KLE Cooperative Society and Civil Engineering Department.");
            EventTime.setTypeface(faceContent);
            EventTime.setText("10 am to 5 pm");
            EventDate.setTypeface(faceContent);
            EventDate.setText("11/03/2016 to 12/03/2016");
            EventRegistrationFees.setTypeface(faceContent);
            EventRegistrationFees.setText("Head to Head:50 per participant\nLAST MAN STANDING:100.00 per participant");
            Contact1.setTypeface(faceContent);
              Contact1.setText("Sachin\n9008879008");
            //  Contact2.setTypeface(faceContent);
            //    Contact2.setText("Sanket\n8147314070");

        }

        //Cultural Events
        //Show Bizz
        if (CulturalPosition.Position == 0) {
            TechnicalPosition.Position=-1;
            CulturalPosition.Position = -1;
            NonTechnicalPosition.Position = -1;
            EventRule1.setTypeface(faceContent);
            EventRule1.setText("1] Time limit: 8-10 minutes.");
            EventRule2.setTypeface(faceContent);
            EventRule2.setText("2] Teams have liberty to choose their own theme.");
            EventRule3.setTypeface(faceContent);
            EventRule3.setText("3] No restrictions on the number of crew members ,actors,cameras and software employed to make the movie.");
            EventRule4.setTypeface(faceContent);
            EventRule4.setText("4] Audio and visual content shall be copyrighted free.");
            EventRule5.setTypeface(faceContent);
            EventRule5.setText("5] The film with maximum number of views on the FC studios youtube channel will win the competition.\n\nNote: Please send your entries at officialfcstudios@gmail.com ");
           EventVenue.setTypeface(faceContent);
            EventVenue.setText("Saptarishi Hall");
            EventTime.setTypeface(faceContent);
            EventTime.setText("11.00 AM");
            EventDate.setTypeface(faceContent);
            EventDate.setText("11 MARCH 2016");
            EventRegistrationFees.setTypeface(faceContent);
            EventRegistrationFees.setText("400 per entry");
               Contact1.setTypeface(faceContent);
               Contact1.setText("Akshay Raikar\n+918095712171");
           // Contact2.setTypeface(faceContent);
           // Contact2.setText("");
        }

        //Cut Throat
        if (CulturalPosition.Position == 1) {

            TechnicalPosition.Position = -1;
            CulturalPosition.Position = -1;
            NonTechnicalPosition.Position = -1;

            EventRule1.setTypeface(faceContent);
            EventRule1.setText("1] Time limit: 3 minutes for Elimination and 5 minutes for Final round.");
            EventRule2.setTypeface(faceContent);
            EventRule2.setText("2] Exceeding time limit involves negative marking.");
            EventRule3.setTypeface(faceContent);
            EventRule3.setText("3] Karaoke and max of 1 accompanist is allowed and Karaoke must be provided in the pendrive before hand.");
            EventRule4.setTypeface(faceContent);
            EventRule4.setText("4] Contestants can participate in Eastern(Hindi) and Western(English) Categories .");
            EventRule5.setTypeface(faceContent);
            EventRule5.setText("5] Judges decision is the final decision.");
            EventVenue.setTypeface(faceContent);
            EventVenue.setText("Saptarishi Hall");
            EventTime.setTypeface(faceContent);
            EventTime.setText("12.00 PM");
            EventDate.setTypeface(faceContent);
            EventDate.setText("9 MARCH 2016");
            EventRegistrationFees.setTypeface(faceContent);
           EventRegistrationFees.setText("100 per participant");
            Contact1.setTypeface(faceContent);
            Contact1.setText("Akshay Raikar\n+918095712171");
     //       Contact2.setTypeface(faceContent);
      //      Contact2.setText("");

        }
        //Feel The Beat
        if (CulturalPosition.Position == 2) {

            TechnicalPosition.Position=-1;
            CulturalPosition.Position=-1;
            NonTechnicalPosition.Position=-1;

            EventRule1.setTypeface(faceContent);
            EventRule1.setText("->] SOLO DANCE");
            EventRule2.setTypeface(faceContent);
            EventRule2.setText("1] Any dance form(Western or Eastern) is accepted.");
            EventRule3.setTypeface(faceContent);
            EventRule3.setText("2] Rounds:\n\nA] Screening:\n\n* The participants are expected to perform on the track of their choice \n\n* Time limit:3 minutes.\n\nB] Face off:\n\n* The selected participants will have to dance on the track chosen by judges.\n\nC] Best foot forward:\n\n* This is an on-stage event.\n\n* Time limit: 3 minutes.");
            EventRule4.setTypeface(faceContent);
            EventRule4.setText("-> GROUP DANCE :");
            EventRule5.setTypeface(faceContent);
            EventRule5.setText("1] Number of members per team: 6 to 15.\n\n2] Time limit:8 minutes(including the stage-setup).\n\n3] Exceeding time limit involves negative marking.\n\n4] Solo acts during the performance will lead to disqualification of the team.\n\n5] Min of 6 members must be present on the stage at any instance of time.\n\n6] No aerial acts,fire works,sharp objects or hazardous props should be employed in the act.\n\n7] Tracks must be submitted at least an hour prior to the performance.\n\n8] Judges decision is final");
            EventVenue.setTypeface(faceContent);
            EventVenue.setText("Solo: Mask Room\nGroup: Main Stage");
            EventTime.setTypeface(faceContent);
            EventTime.setText("Solo: 9.00 AM\nGroup: 4.00 PM");
            EventDate.setTypeface(faceContent);
            EventDate.setText("11 MARCH 2016");
            EventRegistrationFees.setTypeface(faceContent);
            EventRegistrationFees.setText("Group:600 per team\nSolo:100 per individual");
            Contact1.setTypeface(faceContent);
            Contact1.setText("Akshay Raikar\n+918095712171");
            //      Contact2.setTypeface(faceContent);
            //    Contact2.setText("");


        }
        //Rock the Range
        if (CulturalPosition.Position == 3) {
            TechnicalPosition.Position = -1;
            CulturalPosition.Position=-1;
            NonTechnicalPosition.Position=-1;
            EventRule1.setTypeface(faceContent);
            EventRule1.setText("1] Number of members per team:7(max).");
            EventRule2.setTypeface(faceContent);
            EventRule2.setText("2] Time limit:15 minutes.(including stage setup)");
            EventRule3.setTypeface(faceContent);
            EventRule3.setText("3] Exceeding time limit involves negative marking..");
            EventRule4.setTypeface(faceContent);
            EventRule4.setText("4] The participants are expected to carry their own instruments except drums.");
            EventRule5.setTypeface(faceContent);
            EventRule5.setText("5] Judges decision is final decision.");
            EventVenue.setTypeface(faceContent);
            EventVenue.setText("Main Stage");
            EventTime.setTypeface(faceContent);
           EventTime.setText("5.00 PM");
            EventDate.setTypeface(faceContent);
            EventDate.setText("10 MARCH 2016");
            EventRegistrationFees.setTypeface(faceContent);
            EventRegistrationFees.setText("600 per team");
            Contact1.setTypeface(faceContent);
            Contact1.setText("Akshay Raikar\n+918095712171");
        //    Contact2.setTypeface(faceContent);
         //   Contact2.setText("");

        }
          //Vogue
        if (CulturalPosition.Position == 4) {
            TechnicalPosition.Position=-1;
            CulturalPosition.Position=-1;
            NonTechnicalPosition.Position=-1;
            EventRule1.setTypeface(faceContent);
            EventRule1.setText("1] Number of members per team: 6-8.");
            EventRule2.setTypeface(faceContent);
            EventRule2.setText("2] A team can have a Designer, Choreographer and Accompanists in addition.");
            EventRule3.setTypeface(faceContent);
            EventRule3.setText("3] Theme:\n\n1] Birds of the Paradise.\n\n2] Angles & Demons.");
            EventRule4.setTypeface(faceContent);
            EventRule4.setText("4] Time limit:8-10 minutes(inclusive of an introductory note about the theme).");
            EventRule5.setTypeface(faceContent);
            EventRule5.setText("5] Exceeding time limit will lead to negative marking.\n\n6] Sound tracks must be submitted to the organizers well in advance.");
            EventVenue.setTypeface(faceContent);
          EventVenue.setText("Main Stage");
            EventTime.setTypeface(faceContent);
            EventTime.setText("4.00 PM");
            EventDate.setTypeface(faceContent);
            EventDate.setText("11 MARCH 2016");
            EventRegistrationFees.setTypeface(faceContent);
            EventRegistrationFees.setText("800 per team.");
            Contact1.setTypeface(faceContent);
               Contact1.setText("Akshay Raikar\n+918095712171");
            //  Contact2.setTypeface(faceContent);
            //     Contact2.setText("");

        }
        //Smash it up
        if (CulturalPosition.Position == 5) {
            TechnicalPosition.Position = -1;
            CulturalPosition.Position=-1;
            NonTechnicalPosition.Position=-1;

            EventRule1.setTypeface(faceContent);
            EventRule1.setText("1] A Dubsmash video has to be made in the most innovative and humorous way.");
            EventRule2.setTypeface(faceContent);
            EventRule2.setText("2] Time of the video should not exceed more than 20 seconds.");
            EventRule3.setTypeface(faceContent);
            EventRule3.setText("3] Best videos will be screened at various venues during the fest.");
            EventRule4.setTypeface(faceContent);
            EventRule4.setText("4] Vulgarity of controversial videos of any kind will lead to disqualification.");
            EventVenue.setTypeface(faceContent);
            EventVenue.setText("Main Stage");
            EventTime.setTypeface(faceContent);
            EventTime.setText("6.00 PM");
            EventDate.setTypeface(faceContent);
            EventDate.setText("11 and 12 MARCH 2016");
            EventRegistrationFees.setTypeface(faceContent);
            EventRegistrationFees.setText("50 per entry");
                  Contact1.setTypeface(faceContent);
                  Contact1.setText("Ashrita Thakur\n+919591612769");
            //        Contact2.setTypeface(faceContent);
            //       Contact2.setText("");

        }
        //Tales of the Street
        if (CulturalPosition.Position == 6) {

            TechnicalPosition.Position = -1;
            CulturalPosition.Position = -1;
            NonTechnicalPosition.Position = -1;
            EventRule1.setTypeface(faceContent);
            EventRule1.setText("1] Number of members per team:8-20.");
            EventRule2.setTypeface(faceContent);
            EventRule2.setText("2] Time limit: 15 minutes(including setup).");
            EventRule3.setTypeface(faceContent);
            EventRule3.setText("3] The street play should have an impactful social message.Extra marks will be awarded if the act involves 'Make in India' and related slogans.");
            EventRule4.setTypeface(faceContent);
            EventRule4.setText("4] Props are allowed but will not carry extra marks.");
            EventRule5.setTypeface(faceContent);
            EventRule5.setText("5] No aerial acts, fireworks,sharp objects or hazardous props should be employed in the act.");
            EventVenue.setTypeface(faceContent);
         EventVenue.setText("Stage 2");
            EventTime.setTypeface(faceContent);
            EventTime.setText("10 AM");
            EventDate.setTypeface(faceContent);
            EventDate.setText("12 MARCH 2016");
            EventRegistrationFees.setTypeface(faceContent);
            EventRegistrationFees.setText("600 per team");
            Contact1.setTypeface(faceContent);
            Contact1.setText("Akshay Raikar\n+918095712171");
       //     Contact2.setTypeface(faceContent);
        //    Contact2.setText("");

        }
        //Duck and Duchess
        if (CulturalPosition.Position == 7) {
            TechnicalPosition.Position=-1;
            CulturalPosition.Position=-1;
            NonTechnicalPosition.Position = -1;

            EventRule1.setTypeface(faceContent);
            EventRule1.setText("-> Round 1:\n\n* This includes written test on current affairs.");
            EventRule2.setTypeface(faceContent);
            EventRule2.setText("-> Round 2:\n\n* This includes a face off.\n\n* Time allotted in five minutes.\n\n* Topics will be disclosed on the spot.");
            EventRule3.setTypeface(faceContent);
            EventRule3.setText("-> Round 3:\n\n* This is Physical task round.\n\n* Tasks will be disclosed on the spot.\n\n* Shoes and comfortable/sports attire is compulsory.");
            EventRule4.setTypeface(faceContent);
            EventRule4.setText("-> Round 4:\n\n* This includes talent round and stress interview.\n\n* The participants will be given 5 minutes to showcase their talent which will be concluded by stress interview.");
            EventRule5.setTypeface(faceContent);
            EventRule5.setText("Note:On the spot rounds will be added by the organizers if needed . Judges decision will be final.");
            EventVenue.setTypeface(faceContent);
            EventVenue.setText("Round 1: MBA\n Round2: Portico Area");
            EventTime.setTypeface(faceContent);
            EventTime.setText("Round 1: 10.00 AM\n Round 2: 12.00 PM");
            EventDate.setTypeface(faceContent);
            EventDate.setText("11 March 2016");
            EventRegistrationFees.setTypeface(faceContent);
            EventRegistrationFees.setText("100 per individual");
                  Contact1.setTypeface(faceContent);
                 Contact1.setText("Akshay Raikar\n+918095712171");
            //    Contact2.setTypeface(faceContent);
            //   Contact2.setText("");

        }
        //Symphonious
        if (CulturalPosition.Position == 8) {
            TechnicalPosition.Position = -1;
            CulturalPosition.Position = -1;
            NonTechnicalPosition.Position = -1;
            EventRule1.setTypeface(faceContent);
            EventRule1.setText("1] Number of members per Team:7(Max).");
            EventRule2.setTypeface(faceContent);
            EventRule2.setText("2] Time limit: 13 minutes.Exceeding time limit involves negative marking.");
            EventRule3.setTypeface(faceContent);
            EventRule3.setText("3] The participants are expected to carry their own instruments.");
            EventRule4.setTypeface(faceContent);
            EventRule4.setText("4] Keyboard can be used in piano tune only.");
            EventRule5.setTypeface(faceContent);
            EventRule5.setText("5] Cappella performance is permitted.\n\n6]Judges decision is final.");
            EventVenue.setTypeface(faceContent);
            EventVenue.setText("Stage 2");
            EventTime.setTypeface(faceContent);
           EventTime.setText("11.00 AM");
            EventDate.setTypeface(faceContent);
            EventDate.setText("11 MARCH 2016");
            EventRegistrationFees.setTypeface(faceContent);
            EventRegistrationFees.setText("600 per team");
            Contact1.setTypeface(faceContent);
            Contact1.setText("Akshay Raikar\n+918095712171");
        //    Contact2.setTypeface(faceContent);
    //        Contact2.setText("");

        }
        //Tech Fiever
        if (CulturalPosition.Position == 9) {
            TechnicalPosition.Position=-1;
            CulturalPosition.Position = -1;
            NonTechnicalPosition.Position = -1;
            EventRule1.setTypeface(faceContent);
            EventRule1.setText("->Round 1: Project Expo\n\n* 50 teams with 4 members each.\n\n* Time allotted is 5 minutes to each team to present their model.\n\n* Working model or a sample of non-working model with an abstract has to be presented.\n\n* 15 teams qualify for the next round.");
            EventRule2.setTypeface(faceContent);
            EventRule2.setText("->Round 2: Ex-Tempo\n\n* Individual will be randomly grouped into 30 teams with two members in each group.\n\n* Time allotted is 5 minutes per team.\n\n* A picture will be shown to each team.They have to share their ideas about the development of the region given in that picture.\n\n* 10 teams qualify next round.");
            EventRule3.setTypeface(faceContent);
            EventRule3.setText("->Round 3: Congresso\n\n* 20 individuals\n\n* Time allotted for conference is 8 minutes\n\n* Each individual will be given a national issue to discuss upon.\n\n* One winner and One runner up will be announced at the end of this round.");
            EventRule4.setTypeface(faceContent);
            EventRule4.setText("Judges decision is final.");
            EventVenue.setTypeface(faceContent);
           EventVenue.setText("ECE Dept");
            EventTime.setTypeface(faceContent);
            EventTime.setText("11.00 AM");
            EventDate.setTypeface(faceContent);
            EventDate.setText("11 MARCH 2016");
            EventRegistrationFees.setTypeface(faceContent);
            EventRegistrationFees.setText("200 per team");
            Contact1.setTypeface(faceContent);
           Contact1.setText("Akshay Raikar\n+918095712171");
    //        Contact2.setTypeface(faceContent);
      //      Contact2.setText("");

        }
        //Grand Stand
        if (CulturalPosition.Position == 10) {
            TechnicalPosition.Position=-1;
            CulturalPosition.Position=-1;
            NonTechnicalPosition.Position = -1;
            EventRule1.setTypeface(faceContent);
            EventRule1.setText("->Round 1: Mad-Adds\n\n* 15 teams with 6 members each.\n\n* 6 minutes time will allotted for each team.\n\n* The topic should be chosen by the team itself.\n\n* 7 teams qualify for the next round.");
            EventRule2.setTypeface(faceContent);
            EventRule2.setText("->Round 2: Pic-Story\n\n* 14 teams with 3 members in each will be made.\n\n* Time allotted to each team will be 15 minutes.\n\n* Each team has to choose 5 pictures(2 minutes) and build a story connecting the pictures(10 minutes) and present the same(3 minutes).\n\n* 5 teams qualify for the next round.");
            EventRule3.setTypeface(faceContent);
            EventRule3.setText("->Round 3: Motor-Mouth\n\n* 15 individuals selected for the final round.\n\n* Each participant will be shown a video to which he or she has to lip-sync.\n\n* One winner and one runner up will be announced at the end of this round.");
            EventRule4.setTypeface(faceContent);
            EventRule4.setText("Judges decision will be final");
            EventVenue.setTypeface(faceContent);
          EventVenue.setText("Drawing Hall");
            EventTime.setTypeface(faceContent);
            EventTime.setText("11.00 AM");
            EventDate.setTypeface(faceContent);
          EventDate.setText("11 MARCH 2016");
            EventRegistrationFees.setTypeface(faceContent);
            EventRegistrationFees.setText("300 per team");
                Contact1.setTypeface(faceContent);
              Contact1.setText("Akshay Raikar\n+918095712171");
            //  Contact2.setTypeface(faceContent);
           // Contact2.setText("");

        }
        //Paper Presentataion
        if (CulturalPosition.Position == 11) {
            TechnicalPosition.Position = -1;
            CulturalPosition.Position = -1;
            NonTechnicalPosition.Position = -1;
            EventRule1.setTypeface(faceContent);
            EventRule1.setText("1] Number of members in each team :2.");
            EventRule2.setTypeface(faceContent);
            EventRule2.setText("2] Synopsis should be submitted in IEEE format on or before 8/3/2016 media.klecet@gmail.com.");
            EventRule3.setTypeface(faceContent);
            EventRule3.setText("3] First 50 registrations will be entertained and 25 of them will be shortlisted.");
            EventRule4.setTypeface(faceContent);
            EventRule4.setText("4] Synopsis submission involves no registration fees.However the shortlisted teams will have to register by paying the amount on the day of the event.");
            EventRule5.setTypeface(faceContent);
            EventRule5.setText("5] Judges decision will be final.");
            EventVenue.setTypeface(faceContent);
            EventVenue.setText("Auditorium");
            EventTime.setTypeface(faceContent);
            EventTime.setText("9.00 AM");
            EventDate.setTypeface(faceContent);
           EventDate.setText("11 MARCH 2016");
            EventRegistrationFees.setTypeface(faceContent);
            EventRegistrationFees.setText("200 per team");
            Contact1.setTypeface(faceContent);
           Contact1.setText("Akshay Raikar\n+918095712171");
        //    Contact2.setTypeface(faceContent);
         //   Contact2.setText("");

        }
        //Wits and Voice
        if (CulturalPosition.Position == 12) {
            TechnicalPosition.Position=-1;
            CulturalPosition.Position=-1;
            NonTechnicalPosition.Position=-1;
            EventRule1.setTypeface(faceContent);
            EventRule1.setText("1] Individual participation.");
            EventRule2.setTypeface(faceContent);
            EventRule2.setText("2] The event includes group discussion,extempore and debate.");
            EventRule3.setTypeface(faceContent);
            EventRule3.setText("3] Judges decision will be final.");
            EventVenue.setTypeface(faceContent);
            EventVenue.setText("Auditorium");
            EventTime.setTypeface(faceContent);
            EventTime.setText("2.00 PM");
            EventDate.setTypeface(faceContent);
            EventDate.setText("11 MARCH 2016");
            EventRegistrationFees.setTypeface(faceContent);
            EventRegistrationFees.setText("100 per individual");
            Contact1.setTypeface(faceContent);
            Contact1.setText("Akshay Raikar\n+918095712171");
         //   Contact2.setTypeface(faceContent);
          //  Contact2.setText("");

        }
    }

}




