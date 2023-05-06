package danielLiangJavaAndDSA;

import java.util.Scanner;

public class Invoice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" _______________________________________");
        System.out.println("|---------------------------------------|");
        System.out.println("|\t\t REGNOS LTD \t\t|");
        System.out.println("|\t\t  Invoice \t\t|");
        System.out.println("|---------------------------------------|");
        System.out.println("|Date: \t\t\t\t\t|");
        System.out.println("|Name of Cashier:\t\t\t|");
        System.out.println("|\t\t\t\t\t|");
        System.out.println("|---------------------------------------|");
        System.out.println("|Goods bought:\t\t\t\t|");
        System.out.println("|\t\t\t\t\t|");
        System.out.println("|\tGoods\t Qty\tPrice:\t\t|");
        System.out.println("|\t\t\t\t\t|");
        System.out.println("|\t\t\t\t\t|");
        System.out.println("|\t\t\t\t\t|");
        System.out.println("|\t\t\t\t\t|");
        System.out.println("|\t\t\t\t\t|");
        System.out.println("|---------------------------------------|");
        System.out.println("|\t\t\tTotal:\t\t|");
        System.out.println("|_______________________________________|\n");

        String breadSize;
        int smallBreadPrice = 200;
        int mediumBreadPrice = 500;
        int bigBreadPrice = 1000;
        int good1Qty = 0;
        int good1Price = 0;
        int good2Qty = 0;
        int good2Price = 0;
        String date = null;
        String cashier = null;
        String good1 = null;
        String newInvoice;


        String noodlesType;
        int smallNoodlesPrice = 100;
        int superPackNoodlesPrice = 250;
        int hungrymanNoodlesPrice = 500;

        int FufuPrice = 50;

        System.out.print("New invoice?: ");
        newInvoice = input.nextLine();

        String newInvoice2 = null;
        if (newInvoice.equalsIgnoreCase("yes")) {

            System.out.print("Enter date: ");
            date = input.nextLine();

            System.out.print("Name of cashier: ");
            cashier = input.nextLine();


            System.out.print("Great!\nName of goods: ");
            good1 = input.nextLine();

            if (good1.equalsIgnoreCase("Bread")) {
                System.out.print("Please enter Bread size: ");
                good1 = input.nextLine();

                if (!good1.equalsIgnoreCase("small") && !good1.equalsIgnoreCase("medium") && !good1.equalsIgnoreCase("big")) {
                    System.out.print("Error! Try again");
                }

                if (good1.equalsIgnoreCase("small")) {
                    good1 = "Small bread";

                    System.out.print("How many?: ");
                    good1Qty = input.nextInt();

                    good1Price = good1Qty * smallBreadPrice;
                }

                if (good1.equalsIgnoreCase("medium")) {
                    good1 = "Medium bread";

                    System.out.print("How many?: ");
                    good1Qty = input.nextInt();

                    good1Price = good1Qty * mediumBreadPrice;
                }

                if (good1.equalsIgnoreCase("big")) {
                    good1 = "Big bread";

                    System.out.print("How many?: ");
                    good1Qty = input.nextInt();

                    good1Price = good1Qty * bigBreadPrice;
                }

            }

            if (good1.equalsIgnoreCase("Noodles")) {
                System.out.print("Please enter Noodles type: ");
                good1 = input.nextLine();

                if (!good1.equalsIgnoreCase("small") && !good1.equalsIgnoreCase("superpack") && !good1.equalsIgnoreCase("hungryman")) {
                    System.out.print("Error! Try again");
                }

                if (good1.equalsIgnoreCase("small")) {
                    good1 = "Small Noodles";

                    System.out.print("How many?: ");
                    good1Qty = input.nextInt();

                    good1Price = good1Qty * smallNoodlesPrice;
                }

                if (good1.equalsIgnoreCase("superpack")) {
                    good1 = "Superpack noodles";

                    System.out.print("How many?: ");
                    good1Qty = input.nextInt();

                    good1Price = good1Qty * superPackNoodlesPrice;
                }

                if (good1.equalsIgnoreCase("hungryman")) {
                    good1 = "Hungryman noodles";

                    System.out.print("How many?: ");
                    good1Qty = input.nextInt();

                    good1Price = good1Qty * hungrymanNoodlesPrice;
                }
            }

//2 SLOTS REMAINING****		System.out.print("Any other goods? (2 slots left): ");
            System.out.print("Any other goods? ");
            newInvoice2 = input.next();

            if (newInvoice2.equalsIgnoreCase("yes")) {
                System.out.print("Great!\nName of goods: ");
                String good2 = input.next();

                if (good2.equalsIgnoreCase("Bread")) {
                    System.out.print("Please enter Bread size: ");
                    String good2Size = input.next();

                    if (!good2Size.equalsIgnoreCase("small") && !good2Size.equalsIgnoreCase("medium") && !good2Size.equalsIgnoreCase("big")) {
                        System.out.print("Error! Try again");
                    }

                    if (good2Size.equalsIgnoreCase("small")) {
                        good2Size = "Small bread";

                        System.out.print("How many?: ");
                        good2Qty = input.nextInt();
                        good2Price = smallBreadPrice;
                        good2Price = good2Qty * good2Price;
                    }

                    if (good2Size.equalsIgnoreCase("medium")) {
                        good2Size = "Medium bread";

                        System.out.print("How many?: ");
                        good2Qty = input.nextInt();
                        good2Price = mediumBreadPrice;
                        good2Price = good2Qty * good2Price;
                    }

                    if (good2Size.equalsIgnoreCase("big")) {
                        good2Size = "Big bread";

                        System.out.print("How many?: ");
                        good2Qty = input.nextInt();
                        good2Price = bigBreadPrice;
                        good2Price = good2Qty * good2Price;
                    }
                }

                if (good2.equalsIgnoreCase("Noodles")) {
                    System.out.print("Please enter Noodles type: ");
                    String good2Size = input.next();

                    if (!good2Size.equalsIgnoreCase("small") && !good2Size.equalsIgnoreCase("superpack") && !good2Size.equalsIgnoreCase("hungryman")) {
                        System.out.print("Error! Try again");
                    }

                    if (good2Size.equalsIgnoreCase("small")) {
                        good2Size = "Small Noodles";

                        System.out.print("How many?: ");
                        good2Qty = input.nextInt();
                        good2Price = smallNoodlesPrice;
                        good2Price = good2Qty * good2Price;
                    }

                    if (good2Size.equalsIgnoreCase("superpack")) {
                        good2Size = "Superpack noodles";

                        System.out.print("How many?: ");
                        good2Qty = input.nextInt();
                        good2Price = superPackNoodlesPrice;
                        good2Price = good2Qty * good2Price;
                    }

                    if (good2Size.equalsIgnoreCase("hungryman")) {
                        good2Size = "Hungryman noodles";

                        System.out.print("How many?: ");
                        good2Qty = input.nextInt();
                        good2Price = hungrymanNoodlesPrice;
                        good2Price = good2Qty * good2Price;
                    }
                }

//1 SLOT REMAINING****

                System.out.print("Any other goods? (1 slots left): ");
                String newInvoice3 = input.next();

                if (newInvoice3.equalsIgnoreCase("yes")) {
                    System.out.print("Great!\nName of goods: ");
                    String good3 = input.nextLine();

                    if (good3.equalsIgnoreCase("Bread")) {
                        System.out.print("Please enter Bread size: ");
                        String good3Size = input.nextLine();

                        if (!good3Size.equalsIgnoreCase("small") && !good3Size.equalsIgnoreCase("medium") && !good3Size.equalsIgnoreCase("big")) {
                            System.out.print("Error! Try again");
                        }

                        if (good3Size.equalsIgnoreCase("small")) {
                            good3Size = "Small bread";

                            System.out.print("How many?: ");
                            int good3Qty = input.nextInt();
                            int good3Price = smallBreadPrice;
                            good3Price = good3Qty * good3Price;
                        }

                        if (good3Size.equalsIgnoreCase("medium")) {
                            good3Size = "Medium bread";

                            System.out.print("How many?: ");
                            int good3Qty = input.nextInt();
                            int good3Price = mediumBreadPrice;
                            good3Price = good3Qty * good3Price;
                        }

                        if (good3Size.equalsIgnoreCase("big")) {
                            good3Size = "Big bread";

                            System.out.print("How many?: ");
                            int good3Qty = input.nextInt();
                            int good3Price = bigBreadPrice;
                            good3Price = good3Qty * good3Price;
                        }
                    }

                    if (good2.equalsIgnoreCase("Noodles")) {
                        System.out.print("Please enter Noodles type: ");
                        String good3Size = input.nextLine();

                        if (!good3Size.equalsIgnoreCase("small") && !good3Size.equalsIgnoreCase("superpack") && !good3Size.equalsIgnoreCase("hungryman")) {
                            System.out.print("Error! Try again");
                        }

                        if (good3Size.equalsIgnoreCase("small")) {
                            good3Size = "Small Noodles";

                            System.out.print("How many?: ");
                            int good3Qty = input.nextInt();
                            int good3Price = smallNoodlesPrice;
                            good3Price = good3Qty * good3Price;
                        }

                        if (good3Size.equalsIgnoreCase("superpack")) {
                            good3Size = "Superpack noodles";

                            System.out.print("How many?: ");
                            int good3Qty = input.nextInt();
                            int good3Price = superPackNoodlesPrice;
                            good3Price = good3Qty * good3Price;
                        }

                        if (good3Size.equalsIgnoreCase("hungryman")) {
                            good3Size = "Hungryman noodles";

                            System.out.print("How many?: ");
                            int good3Qty = input.nextInt();
                            int good3Price = hungrymanNoodlesPrice;
                            good3Price = good3Qty * good3Price;
                        }
                    }
                }

                if (newInvoice2.equalsIgnoreCase("no")) {
                    System.out.println(" _______________________________________");
                    System.out.println("|---------------------------------------|");
                    System.out.println("|\t\t REGNOS LTD \t\t|");
                    System.out.println("|\t\t  Invoice \t\t|");
                    System.out.println("|---------------------------------------|");
                    System.out.printf("|Date: %s \t\t\t|%n", date);
                    System.out.printf("|Name of Cashier: %s \t\t|%n", cashier);
                    System.out.println("|\t\t\t\t\t|");
                    System.out.println("|---------------------------------------|");
                    System.out.println("|Goods bought:\t\t\t\t|");
                    System.out.println("|\t\t\t\t\t|");
                    System.out.println("|  Goods\t\tQty\tPrice:\t|");
                    System.out.printf("|%s\t\t %d\t%d\t|%n", good1, good1Qty, good1Price);
                    System.out.printf("|%s\t\t %d\t%d\t|%n", good2, good2Qty, good2Price);
                    System.out.println("|\t\t\t\t\t|");
                    System.out.println("|\t\t\t\t\t|");
                    System.out.println("|\t\t\t\t\t|");
                    System.out.println("|\t\t\t\t\t|");
                    System.out.println("|---------------------------------------|");
                    System.out.println("|\t\t\tTotal:\t\t|");
                    System.out.println("|_______________________________________|\n");

                }

                if (!newInvoice2.equalsIgnoreCase("no") && !newInvoice.equalsIgnoreCase("yes")) {
                    System.out.print("Error! Try again");
                }
            }
        }

        if (newInvoice2.equalsIgnoreCase("no")) {
            System.out.println(" _______________________________________");
            System.out.println("|---------------------------------------|");
            System.out.println("|\t\t REGNOS LTD \t\t|");
            System.out.println("|\t\t  Invoice \t\t|");
            System.out.println("|---------------------------------------|");
            System.out.printf("|Date: %s \t\t\t|%n", date);
            System.out.printf("|Name of Cashier: %s \t\t|%n", cashier);
            System.out.println("|\t\t\t\t\t|");
            System.out.println("|---------------------------------------|");
            System.out.println("|Goods bought:\t\t\t\t|");
            System.out.println("|\t\t\t\t\t|");
            System.out.println("|  Goods\t\tQty\tPrice:\t|");
            System.out.printf("|%s\t\t %d\t%d\t|%n", good1, good1Qty, good1Price);
            System.out.println("|\t\t\t\t\t|");
            System.out.println("|\t\t\t\t\t|");
            System.out.println("|\t\t\t\t\t|");
            System.out.println("|\t\t\t\t\t|");
            System.out.println("|---------------------------------------|");
            System.out.println("|\t\t\tTotal:\t\t|");
            System.out.println("|_______________________________________|\n");

        }
        if (!newInvoice2.equalsIgnoreCase("no") && !newInvoice.equalsIgnoreCase("yes")) {
            System.out.print("Error! Try again");
        }

        if (newInvoice.equalsIgnoreCase("no")) {
            System.out.print("Alright, do always check back once there is/are sale(s)");
        }

        if (!newInvoice.equalsIgnoreCase("no") && !newInvoice.equalsIgnoreCase("yes")) {
            System.out.print("Error! Try again");
        }
    }
}