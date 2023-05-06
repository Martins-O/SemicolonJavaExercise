package tdd.GraceTask;

import java.util.Scanner;

public class Phone_3310 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int phoneBook;
        int messages;
        int chat;
        int callRegister;
        int phoneMenu;
        int tones;
        int settings;
        int callDivert;
        int games;
        int calculator;
        int reminder;
        int clock = 0;
        int profiles;
        int simServices;

      printPhoneMenu();

        phoneMenu = input.nextInt();

        if (phoneMenu >= 1 && phoneMenu <= 13) {
            switch (phoneMenu) {
                case 1:
                   // if (phoneMenu == 1) {
                        System.out.println("""
                                PhoneBook
                                1: Search
                                2: Service nos
                                3: Add name
                                4: Erase
                                5: Edit
                                6: Assign tone
                                7: Send b'card
                                8: Options
                                9: Speed dials
                                10: Voice tags
                                11: back
                                """);

                        System.out.println("Press 1 - 10 to open PhoneBook");
                        phoneBook = input.nextInt();


                        if (phoneBook >= 1 && phoneBook <= 10) {
                            switch (phoneBook) {
                                case 1:
                                    System.out.println("Search");
                                    break;
                            }
                            switch (phoneBook) {
                                case 2:
                                    System.out.println("Service nos");
                                    break;
                            }
                            switch (phoneBook) {
                                case 3:
                                    System.out.println("Add name");
                                    break;
                            }
                            switch (phoneBook) {
                                case 4:
                                    System.out.println("Erase");
                                    break;
                            }
                            switch (phoneBook) {
                                case 5:
                                    System.out.println("Edit");
                                    break;
                            }
                            switch (phoneBook) {
                                case 6:
                                    System.out.println("Assign note");
                                    break;
                            }
                            switch (phoneBook) {
                                case 7:
                                    System.out.println("Send b'card1");
                                    break;
                            }
                            int options = 0;
                            switch (phoneBook) {
                                case 8:
                                    System.out.println("""
                                            Options
                                            1: Type of view
                                            2: Memory status
                                            """);
                                    System.out.println("press 1 - 2");
                                    options = input.nextInt();

                                    if (options >= 1 && options <= 2)
                                        switch (options) {
                                            case 1:
                                                System.out.println("Type of view");
                                                break;
                                        }
                                    switch (options) {
                                        case 2:
                                            System.out.println("Memory status");
                                            break;
                                    }
                            }
                            switch (phoneBook) {
                                case 9:
                                    System.out.println("Speed dials");
                                    break;
                            }
                            switch (phoneBook) {
                                case 10:
                                    System.out.println("voice dials");
                                    break;
                            }
                            switch (phoneBook)  { case 11:
                                System.out.println("I dey here");
                                printPhoneMenu();

                                phoneMenu = input.nextInt();
                            }
                        }

                   // }
            }
            if (phoneMenu >= 1 && phoneMenu <= 13) {
                switch (phoneMenu) {
                    case 2:
                        if (phoneMenu == 2) {
                            System.out.println("""
                                    Messages
                                    1: Write messages
                                    2: Inbox
                                    3: Outbox
                                    4: Picture Messages
                                    5: Templates
                                    6: Smileys
                                    7: Message settings
                                    8: Info service
                                    9: Voice Mailbox
                                    10: Service command editor""");
                            System.out.println("press 1 - 10 to open Messages: ");
                            messages = input.nextInt();
                            if (messages >= 1 && messages <= 10) {
                                switch (messages) {
                                    case 1:
                                        System.out.println("Write messages");
                                        break;
                                }
                                switch (messages) {
                                    case 2:
                                        System.out.println("inbox");
                                        break;
                                }
                                switch (messages) {
                                    case 3 -> System.out.println("outbox");
                                }
                                switch (messages) {
                                    case 4:
                                        System.out.println("Picture messages");
                                        break;
                                }
                                switch (messages) {
                                    case 5:
                                        System.out.println("Templates");
                                        break;
                                }
                                switch (messages) {
                                    case 6:
                                        System.out.println("Smileys");
                                        break;
                                }
                                int messagesSetting;
                                int set;
                                int common;
                                switch (messages) {
                                    case 7:
                                        System.out.println("""
                                                messages settings:
                                                1: Set
                                                2: common""");
                                        messagesSetting = input.nextInt();
                                        if (messagesSetting >= 1 && messagesSetting < 2)
                                            switch (messagesSetting) {
                                                case 1:
                                                    if (messagesSetting == 1) {
                                                        System.out.println("""
                                                                Set:
                                                                1: Message centre number
                                                                2: Messages sent as
                                                                3: Message validity""");
                                                        set = input.nextInt();
                                                        if (set >= 1 && set <= 3) {
                                                            switch (set) {
                                                                case 1:
                                                                    if (set == 1) {
                                                                        System.out.println("Message centre number");
                                                                        break;
                                                                    }
                                                                    switch (set) {
                                                                        case 2:
                                                                            if (set == 2) {
                                                                                System.out.println("Messges sent as");
                                                                                break;
                                                                            }
                                                                            switch (set) {
                                                                                case 3:
                                                                                    if (set == 3) {
                                                                                        System.out.println("Message validity");
                                                                                        break;
                                                                                    }
                                                                            }
                                                                    }
                                                            }
                                                        }
                                                    }
                                            }
                                        if (messagesSetting >= 1)
                                            switch (messagesSetting) {
                                                case 2:
                                                    if (messagesSetting == 2) {
                                                        System.out.println("""
                                                                Common:
                                                                1: Delivery Reports
                                                                2: Reply via same centre
                                                                3: Character support""");
                                                        common = input.nextInt();
                                                        if (common >= 1 && common <= 3) {
                                                            switch (common) {
                                                                case 1:
                                                                    System.out.println("Delivery Reports");
                                                                    break;
                                                            }
                                                            switch (common) {
                                                                case 2:
                                                                    System.out.println("Reply via same centre");
                                                                    break;
                                                            }
                                                            switch (common) {
                                                                case 3:
                                                                    System.out.println("Character support");
                                                                    break;
                                                            }
                                                        }
                                                    }
                                            }
                                }
                                switch (messages) {
                                    case 8:
                                        System.out.println("Info service");
                                        break;
                                }
                                switch (messages) {
                                    case 9:
                                        System.out.println("Voice mailbox");
                                        break;
                                }
                                switch (messages) {
                                    case 10:
                                        System.out.println("Service command editor");
                                        break;
                                }
                            }
                        }
                }
            }
            if (phoneMenu >= 1 && phoneMenu <= 13) {
                switch (phoneMenu) {
                    case 3:
                        if (phoneMenu == 3) {
                            System.out.println("Chat");

                            System.out.println("Open Chat");
                            chat = input.nextInt();
                            break;
                        }
                }
            }
        }
        if (phoneMenu >= 1 && phoneMenu <= 13) {
            switch (phoneMenu) {
                case 4:
                    if (phoneMenu == 4) {
                        System.out.println("""
                                Call register
                                1: Missed calls
                                2: Received calls
                                3: Dialed numbers
                                4: Erase recent call lists
                                5: Call
                                6: show call costs
                                7: call cost settings
                                8: prepaid
                                """);

                        System.out.println("press 1 - 8");
                        callRegister = input.nextInt();

                        if (callRegister >= 1 && callRegister <= 8) {
                            switch (callRegister) {
                                case 1:
                                    System.out.println("Missed calls");
                                    break;
                            }
                            switch (callRegister) {
                                case 2:
                                    System.out.println("Received calls");
                                    break;
                            }
                            switch (callRegister) {
                                case 3:
                                    System.out.println("Dialed numbers");
                                    break;
                            }
                            switch (callRegister) {
                                case 4:
                                    System.out.println("Erase recent call lists");
                                    break;
                            }
                            int showCallDuration;
                            switch (callRegister) {
                                case 5:
                                    System.out.println("Show call duration\n" +
                                            "1: last call duration" +
                                            "2: All calls duration" +
                                            "3: Received calls duration" +
                                            "4: Dialled calls duration" +
                                            "5: Clear timers");
                                    System.out.println("press 1 - 6 to open call duration");
                                    showCallDuration = input.nextInt();

                                    if (showCallDuration >= 1 && showCallDuration <= 5)
                                        switch (showCallDuration) {
                                            case 1:
                                                System.out.println("last call duration");
                                                break;
                                        }
                                    switch (showCallDuration) {
                                        case 2:
                                            System.out.println("All calls duration");
                                            break;
                                    }
                                    switch (showCallDuration) {
                                        case 3:
                                            System.out.println("Received calls duration");
                                            break;
                                    }
                                    switch (showCallDuration) {
                                        case 4:
                                            System.out.println("Dialled calls duration");
                                            break;
                                    }
                                    switch (showCallDuration) {
                                        case 5:
                                            System.out.println("Clear timers");
                                            break;
                                    }
                            }
                            int showCallCost;
                            switch (callRegister) {
                                case 6:
                                    System.out.println("""
                                            Show call costs
                                            1: Last call costs
                                            2: All calls cost
                                            3: Clear counters""");
                                    System.out.println("press 1 - 3 to open call costs");
                                    showCallCost = input.nextInt();

                                    if (showCallCost >= 1 && showCallCost <= 3)
                                        switch (showCallCost) {
                                            case 1:
                                                System.out.println("Last call costs");
                                                break;
                                        }
                                    switch (showCallCost) {
                                        case 2:
                                            System.out.println("All calls costs");
                                            break;
                                    }
                                    switch (showCallCost) {
                                        case 3:
                                            System.out.println("Clear counters");
                                            break;
                                    }
                            }
                            int callCostSettings;
                            switch (callRegister) {
                                case 7:
                                    System.out.println("""
                                            Call cost settings
                                            1: Call cost limit
                                            2: Show costs in""");
                                    System.out.println("press 1 - 2 to open call cost settings");
                                    callCostSettings = input.nextInt();

                                    if (callCostSettings >= 1 && callCostSettings <= 2) {
                                        switch (callCostSettings) {
                                            case 1:
                                                System.out.println("Call cost limit");
                                                break;
                                        }
                                        switch (callCostSettings) {
                                            case 2:
                                                System.out.println("Show costs in");
                                                break;
                                        }
                                    }
                            }
                            switch (callRegister) {
                                case 8:
                                    System.out.println("Prepaid Credit");
                                    break;
                            }
                        }
                    }
            }
        }
        if (phoneMenu >= 1 && phoneMenu <= 13) {
            switch (phoneMenu) {
                case 5:
                    if (phoneMenu == 5) {
                        System.out.println("""
                                Tones
                                1: Ringing tone
                                2: Ringing volume
                                3: Incoming call alert
                                4: Composer
                                5: Message alert alone
                                6: Keypad tones
                                7: Warning and games tones
                                8: Vibrating alert
                                9: Screen saver
                                """);

                        System.out.println("Press 1 - 9 to open Tones");
                        tones = input.nextInt();

                        if (tones >= 1 && tones <= 9)
                            switch (tones) {
                                case 1:
                                    System.out.println("Ringing tone");
                                    break;
                            }
                        switch (tones) {
                            case 2:
                                System.out.println("Ringing Volume");
                                break;
                        }
                        switch (tones) {
                            case 3:
                                System.out.println("Incoming call alert");
                                break;
                        }
                        switch (tones) {
                            case 4:
                                System.out.println("Composer");
                                break;
                        }
                        switch (tones) {
                            case 5:
                                System.out.println("Messages alert tone");
                                break;
                        }
                        switch (tones) {
                            case 6:
                                System.out.println("Keypad tones");
                                break;
                        }
                        switch (tones) {
                            case 7:
                                System.out.println("Warning and game tones");
                                break;
                        }
                        switch (tones) {
                            case 8:
                                System.out.println("Vibrating alert");
                                break;
                        }
                        switch (tones) {
                            case 9:
                                System.out.println("Screen saver");
                                break;
                        }
                    }
            }
        }
        if (phoneMenu >= 1 && phoneMenu <= 13) {
            switch (phoneMenu) {
                case 6:
                    if (phoneMenu == 6) {
                        System.out.println("""
                                Settings
                                1: Call settings
                                2: Phone settings
                                3: Security settings
                                4: Restore factory setting
                                """);

                        System.out.println("Press 1 - 4 to open PhoneBook");
                        settings = input.nextInt();

                        int phoneSettings;
                        int securitySettings;
                        int restoreFactorySetting;
                        int callSettings;
                        if (settings >= 1 && settings <= 4) {
                            switch (settings) {
                                case 1:
                                    System.out.println("""
                                            Call settings
                                            1: Automatic redial
                                            2: Speed dialing
                                            3: call waiting options
                                            4: Own number sending
                                            5: Phone line in use
                                            6: Automatic answer
                                            """);
                                    callSettings = input.nextInt();

                                    if (callSettings >= 1 && callSettings <= 6) {
                                        switch (callSettings) {
                                            case 1:
                                                System.out.println("Automatic redial");
                                                break;
                                        }
                                        switch (callSettings) {
                                            case 2:
                                                System.out.println("Speed dialing");
                                                break;
                                        }
                                        switch (callSettings) {
                                            case 3:
                                                System.out.println("Call waiting options");
                                                break;
                                        }
                                        switch (callSettings) {
                                            case 4:
                                                System.out.println("Own number sending");
                                                break;
                                        }
                                        switch (callSettings) {
                                            case 5:
                                                System.out.println("Phone line in use");
                                                break;
                                        }
                                        switch (callSettings) {
                                            case 6:
                                                System.out.println("Automatic answer");
                                                break;
                                        }
                                    }
                            }
                            switch (settings) {
                                case 2:
                                    System.out.println("""
                                            Phone settings
                                            1: Language
                                            2: cell info display
                                            3: Welcome note
                                            4: Network selection
                                            5: lights
                                            6: confirm sim service actions""");
                                    System.out.println("press 1 - 6 to open Phone settings");
                                    phoneSettings = input.nextInt();

                                    if (phoneSettings >= 1 && phoneSettings <= 6) {
                                        switch (phoneSettings) {
                                            case 1:
                                                System.out.println("Language");
                                                break;
                                        }
                                        switch (phoneSettings) {
                                            case 2:
                                                System.out.println("Cell info display");
                                                break;
                                        }
                                        switch (phoneSettings) {
                                            case 3:
                                                System.out.println("Welcome note");
                                                break;
                                        }
                                        switch (phoneSettings) {
                                            case 4:
                                                System.out.println("Network Selection");
                                                break;
                                        }
                                        switch (phoneSettings) {
                                            case 5:
                                                System.out.println("Lights");
                                                break;
                                        }
                                        switch (phoneSettings) {
                                            case 6:
                                                System.out.println("Confirm SIM service actions");
                                                break;
                                        }
                                    }
                            }
                            switch (settings) {
                                case 3:
                                    System.out.println("""
                                            Security settings
                                            1: Pin code request
                                            2: Call barring service
                                            3: fixed dialling
                                            4: closed user group
                                            5: Phone security
                                            6: Change access codes""");
                                    System.out.println("press 1 - 6 to open Security settings");
                                    securitySettings = input.nextInt();

                                    if(securitySettings >= 1 && securitySettings <= 6){
                                        switch (securitySettings){
                                            case 1:
                                                System.out.println("Pin code request");
                                                break;
                                        }
                                        switch (securitySettings){
                                            case 2:
                                                System.out.println("call barring service");
                                                break;
                                        }
                                        switch (securitySettings){
                                            case 3:
                                                System.out.println("Fixed dialling");
                                                break;
                                        }
                                        switch (securitySettings){
                                            case 4:
                                                System.out.println("Closed user group");
                                                break;
                                        }
                                        switch (securitySettings){
                                            case 5:
                                                System.out.println("Phone security");
                                                break;
                                        }
                                        switch (securitySettings){
                                            case 6:
                                                System.out.println("Change access code");
                                                break;
                                        }
                                    }
                            }
                            switch (settings) {
                                case 4:
                                    System.out.println("Restore factory settings");
                                    break;
                            }
                        }
                    }
            }
        }
        if (phoneMenu >= 1 && phoneMenu <= 13){
            switch (phoneMenu){
                case 7:
                    System.out.println("call Divert");
                    break;
            }
        }
        if (phoneMenu >= 1 && phoneMenu <= 13){
            switch (phoneMenu){
                case 8:
                System.out.println("Games");
                break;
            }
        }
        if (phoneMenu >= 1 && phoneMenu <= 13){
            switch (phoneMenu){
                case 9:
                    System.out.println("Calculator");
                    break;
            }
        }
        if (phoneMenu >= 1 && phoneMenu <= 13){
            switch (phoneMenu){
                case 10:
                    System.out.println("Reminders");
                    break;
            }
        }
        if (phoneMenu >= 1 && phoneMenu <= 13){
            switch (phoneMenu){
                case 11:
                    System.out.println("""
                            Clock
                            1: Alarm clock
                            2: clock setting
                            3: Date setting
                            4: Stopwatch
                            5: Countdown timer
                            6: Auto update of date and time
                            """);
                    System.out.println("press 1 - 6 to open Clock");
                    clock = input.nextInt();
            }
            if (clock >= 1 && clock <= 6){
                switch (clock){
                    case 1:
                        System.out.println("Alarm clock");
                        break;
                }
                switch (clock){
                    case 2:
                        System.out.println("Clock settings");
                        break;
                }
                switch (clock){
                    case 3:
                        System.out.println("Date settings");
                        break;
                }
                switch (clock){
                    case 4:
                        System.out.println("Stopwatch");
                        break;
                }
                switch (clock){
                    case 5:
                        System.out.println("Countdown timer");
                        break;
                }
                switch (clock){
                    case 6:
                        System.out.println("Auto update of date and time");
                        break;
                }
            }
        }
        if (phoneMenu >= 1 && phoneMenu <= 13){
            switch (phoneMenu){
                case 12:
                    System.out.println("Profiles");
                    break;
            }
        }
        if(phoneMenu >= 1 && phoneMenu <= 13){
            switch (phoneMenu){
                case 13:
                    System.out.println("SIM services");
            }
        }
    }
    public  static  void printPhoneMenu(){
        System.out.println("""
                Phone menu
                :1: PhoneBook
                2: Messages
                3: Chat
                4: Call register
                5: Tones
                6: Settings
                7: Call divert
                8: Games
                9: Calculator
                10: Reminders
                11:Clock
                12: Profiles
                13: Sim services""");

        System.out.println("press 1 - 13");
    }

}

