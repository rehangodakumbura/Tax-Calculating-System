import java.util.*;
class Example{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);

	    L0:do{
			clearConsole();
			int a,b,c,d,e,f;
			
			System.out.println("\r  _____            ___      _         _      _           \r\n |_   _|_ ___ __  / __|__ _| |__ _  _| |__ _| |_ ___ _ _ \r\n   | |/ _` \\ \\ / | (__/ _` | / _| || | / _` |  _/ -_) \'_|\r\n   |_|\\__,_/_\\_\\  \\___\\__,_|_\\__|\\_,_|_\\__,_|\\__\\___|_|  \r\n                                                         \r\n");
			System.out.println("============================================================================================================\n");	
		
			
			System.out.println("\t\t[1] Withholding Tax");	
			System.out.println("\t\t[2] Payable Tax");
			System.out.println("\t\t[3] Income Tax");
			System.out.println("\t\t[4] Social Sicurity Contribution Levy (SSCL) Tax");
			System.out.println("\t\t[5] Leasing Payment");
			System.out.println("\t\t[6] Exit\n");
			
			System.out.print("\t\tEnter an option to continue -->");
			int num1=input.nextInt();

			
			switch(num1){
				case 1 :L1:do{
							clearConsole();
							System.out.println("\t+---------------------------------------------------------+");
							System.out.println("\t|                      WITHHOLDING TAX                    |");
							System.out.println("\t+---------------------------------------------------------+\n");
							System.out.println("\t\t[1] Rent Tax");
							System.out.println("\t\t[2] Bank Interest Tax");
							System.out.println("\t\t[3] Divident Tax");
							System.out.println("\t\t[4] Exit\n");
							
							
							System.out.print("\t\tEnter an option to continue -->");
							int num2=input.nextInt();

							switch(num2){
								case 1 :L1i:do{
											clearConsole();
											System.out.println("\n\t+---------------------------------------------------------+");
											System.out.println("\t|                      RENT TAX                           |");
											System.out.println("\t+---------------------------------------------------------+");
											do{
												
												System.out.print("\n\t\tEnter your Rent    : ");
												a=input.nextInt();

												double renttax;
												if (a>100000){
													renttax= ((a-100000)*10)/100;
													System.out.printf("\t\tYou have to pay Rent Tax : %.2f\n\n",renttax);
												}else if(a<0){
													System.out.println("\n\t\t...Wrong Rent ....\n");

													L1i1i1i:do{
														
														System.out.print("\n\t\tDo you want to input correct Rent  again (Y/N) : ");
															char op=input.next().charAt(0);
															if(op=='n'|| op=='N'){
																break L1i;
															}else if(op=='y'||op=='Y'){
																do{
																clearConsole();	
																continue L1i;
																}while(true);
															}else{
																System.out.println("\n\t\tWrong option.. input correct...\n");
																continue L1i1i1i;
															}
													}while(true);
												}else{
													System.out.println("\n\t\tYou don't have to pay Rent Tax...  \n");
												}
											
												L1i1i:do{
													System.out.print("\t\tDo you want to calculate another Rent tax (Y/N) : ");
														char op=input.next().charAt(0);
														if(op=='n'|| op=='N'){
															break L1i;
														}else if(op=='y'||op=='Y'){
															continue L1i;
														}else{
															System.out.println("\n\t\tWrong option.. input correct...\n");
															continue L1i1i;
														}
												}while(true);
											}while(true);
											

										}while(true);break;	
									
								case 2 :L1ii:do{
											clearConsole();
											System.out.println("\n\t+---------------------------------------------------------+");
											System.out.println("\t|                  BANK INTEREST TAX                      |");
											System.out.println("\t+---------------------------------------------------------+");	

											do{
												System.out.print("\n\t\tEnter your Bank Interest per year    : ");
												b=input.nextInt();
													if(b>0){
													double bankint;
													bankint=(b*5)/100;
														System.out.printf("\t\tYou have to pay bank interest tax per year : %.2f\n\n",bankint);
													}else{
													System.out.println("\n\t\t...Wrong Bank Interest per year...\n");

														L1ii1ii1ii:do{
														System.out.print("\n\t\tDo you want to input correct Bank Interest per year again (Y/N) : ");
															char op=input.next().charAt(0);
															if(op=='n'|| op=='N'){
																break L1ii;
															}else if(op=='y'||op=='Y'){
																do{
																clearConsole();
																continue L1ii;
																}while(true);
															}else{
																System.out.println("\n\t\tWrong option.. input correct...\n");
																continue L1ii1ii1ii;
															}	
														}while(true);
													}
												L1ii1ii:do{
													System.out.print("\t\tDo you want to calculate another Bank Interest tax (Y/N) : ");
														char op=input.next().charAt(0);
														if(op=='n'|| op=='N'){
															break L1ii;
														}else if(op=='y'||op=='Y'){
															continue L1ii;
														}else{
															System.out.println("\n\t\tWrong option.. input correct...\n");
															continue L1ii1ii;
														}	
												}while(true);		
											}while(true);	
										}while(true);break;

								case 3 :L1iii:do{
											clearConsole();
											System.out.println("\n\t+---------------------------------------------------------+");
											System.out.println("\t|                     DIVIDENT TAX                        |");
											System.out.println("\t+---------------------------------------------------------+");

											do{
												System.out.print("\n\t\tEnter your total divident per year    : ");
												c=input.nextInt();

													double divid;
													if (c>100000){
														divid=((c-100000)*0.14);
														System.out.printf("\t\tYou have to pay divident tax per year : %.2f\n\n",divid);
													}else if(c<0){
														System.out.println("\n\t\t...Wrong total divident per year...\n");
														L1iii1iii1iii:do{
															System.out.print("\n\t\tDo you want to input correct total divident per year again (Y/N) : ");
															char op=input.next().charAt(0);
															if(op=='n'|| op=='N'){
																break L1iii;
															}else if(op=='y'||op=='Y'){
																do{
																clearConsole();
																continue L1iii;
																}while(true);
															}else{
																System.out.println("\n\t\tWrong option.. input correct...\n");
																continue L1iii1iii1iii;
															}
														}while(true);
													}else{
														System.out.print("\n\t\tYou don't have to pay Divident Tax  ");
													}
												L1iii1iii:do{
													System.out.print("\n\t\tDo you want to calculate another Divident tax (Y/N) : ");
													char op=input.next().charAt(0);
													if(op=='n'|| op=='N'){
														break L1iii;
													}else if(op=='y'||op=='Y'){
														continue L1iii;
													}else{
														System.out.println("\n\t\tWrong option.. input correct...\n");
														continue L1iii1iii;
													}
												}while(true);
											}while(true);
										}while(true);break;
								case 4 :break L1;
								default:System.out.println("\n\t\t...Wrong number...");
											L8:do{
																					
												System.out.print("\n\t\tDo you want to input correct number again (Y/N) : ");
													char op=input.next().charAt(0);
													if(op=='n'|| op=='N'){
														break L1;
													}else if(op=='y'||op=='Y'){
														do{
														clearConsole();	
														continue L1;
														}while(true);
													}else{
														System.out.println("\n\t\tWrong option.. input correct...\n");
														do{
														continue L8;
														}while(true);
													}
											}while(true);
							}
						}while(true);break;
				
				case 2 :L2:do{
							clearConsole();
							System.out.println("\n\t+---------------------------------------------------------+");
							System.out.println("\t|                      PAYABLE TAX                        |");
							System.out.println("\t+---------------------------------------------------------+");

							do{
								System.out.print("\n\t\tEnter your employee payment per month    : ");
								d=input.nextInt();
							
								if(d>0){
									double pay,pay1,pay2,pay3,pay4,pay5;
									if(d>0 & d<=100000){
										System.out.println("\t\tYou do not pay a payable tax....\n");
									}else if(d>100000 & d<=141667){
										pay=((d-100000)*6/100);
										System.out.printf("\t\tYou have to pay payable tax per month :%.2f\n\n",pay);
									}else if(d>141667 & d<=183333){
										pay1=((d-141667)*12/100)+2500;
										System.out.printf("\t\tYou have to pay payable tax per month :%.2f\n\n",pay1);
									}else if(d>183333 & d<=225000){
										pay2=((d-183333)*18/100)+7500;
										System.out.printf("\t\tYou have to pay payable tax per month :%.2f\n\n",pay2);
									}else if(d>225000 & d<=266667){
										pay3=((d-225000)*24/100)+15000;
										System.out.printf("\t\tYou have to pay payable tax per month :%.2f\n\n",pay3);
									}else if(d>266667 & d<=308333){
										pay4=((d-266667)*30/100)+25000;
										System.out.printf("\t\tYou have to pay payable tax per month :%.2f\n\n",pay4);
									}else if(d>308333){
										pay5=((d-308333)*36/100)+37500;
										System.out.printf("\t\tYou have to pay payable tax per month :%.2f\n\n",pay5);
									}
								}else{
									System.out.println("\t\t...Wrong employee payment per month...");
										L2i2i:do{	
										System.out.print("\n\t\tDo you want to input correct employee payment per month again (Y/N) : ");
											char op=input.next().charAt(0);
											if(op=='n'|| op=='N'){
												break L2;
											}else if(op=='y'||op=='Y'){
												do{
												clearConsole();	
												continue L2;
												}while(true);
											}else{
												System.out.println("\n\t\tWrong option.. input correct...\n");
													continue L2i2i;
											}
										}while(true);
								}
								L2i:do{
										System.out.print("\n\t\tDo you want to calculate another Payable tax (Y/N) : ");
										char op=input.next().charAt(0);
										if(op=='n'|| op=='N'){
											break L2;
										}else if(op=='y'||op=='Y'){
											continue L2;
										}else{
											System.out.println("\t\tWrong option.. input correct...\n");
												continue L2i;
										}
								}while(true);
							}while(true);
						}while(true);break;

				case 3 :L3:do{
							clearConsole();
							System.out.println("\n\t+---------------------------------------------------------+");
							System.out.println("\t|                      INCOME TAX                         |");
							System.out.println("\t+---------------------------------------------------------+");
							
							do{
								System.out.print("\n\t\tEnter your total income per year : ");
								e=input.nextInt();

								if(e>0){
										double inc,inc1,inc2,inc3,inc4,inc5;
										if(e>0 & e<=1200000){
											System.out.println("\t\tYou do not pay a income tax...\n\n");
										}else if(e>1200000 & e<=1700000){
											inc=((e-1200000)*6/100);
											System.out.printf("\t\tYou have to pay income tax per year :%.2f\n\n",inc);
										}else if(e>1700000 & e<=2200000){
											inc1=((e-1700000)*12/100)+30000;
											System.out.printf("\t\tYou have to pay income tax per year :%.2f\n\n",inc1);
										}else if (e>2200000 & e<=2700000){
											inc2=((e-2200000)*18/100)+90000;
											System.out.printf("\t\tYou have to pay income tax per year :%.2f\n\n",inc2);
										}else if (e>2700000 & e<=3200000){
											inc3=((e-2700000)*24/100)+180000;
											System.out.printf("\t\tYou have to pay income tax per year :%.2f\n\n",inc3);
										}else if (e>3200000 & e<=3700000){
											inc4=((e-3200000)*30/100)+300000;
											System.out.printf("\t\tYou have to pay income tax per year :%.2f\n\n",inc4);
										}else if (e>3700000){
											inc5=((e-3700000)*36/100)+450000;
											System.out.printf("\t\tYou have to pay income tax per year :%.2f\n\n",inc5);
										}
								}else{
									System.out.println("\n\t\t...Wrong total Income...");
									L3i3i:do{	
										System.out.print("\n\t\tDo you want to input correct total Income again (Y/N) : ");
										char op=input.next().charAt(0);
										if(op=='n'|| op=='N'){
											break L3;
										}else if(op=='y'||op=='Y'){
											do{
											clearConsole();	
											continue L3;
											}while(true);
										}else{
											System.out.println("\n\t\tWrong option.. input correct...\n");
												continue L3i3i;
										}
									}while(true);
								}
								L3i:do{
									System.out.print("\t\tDo you want to calculate another Income tax (Y/N) : ");
									char op=input.next().charAt(0);
									if(op=='n'|| op=='N'){
										break L3;
									}else if(op=='y'||op=='Y'){
										continue L3;
									}else{
										System.out.println("\n\t\tWrong option.. input correct...\n");
										continue L3i;
									}
								}while(true);
							}while(true);
						}while(true);break;

				case 4 :L4:do{
							clearConsole();
							System.out.println("\n\t+---------------------------------------------------------+");
							System.out.println("\t|     SOCIAL SECURITY  CONTRIBUTION LEVY (SSCL) TAX       |");
							System.out.println("\t+---------------------------------------------------------+");

							do{
								System.out.print("\n\t\tEnter value of Good or Service :");
								f=input.nextInt();

									if(f>0){
										double saletax,afsaletax,vat,totsscl;
										saletax=((f*2.5)/100);
										afsaletax=saletax+f;
										vat=(afsaletax*15)/100;
										totsscl=saletax+vat;
										System.out.printf("\t\tYou have to pay SSCL Tax : %.2f\n\n",totsscl);
									}else{
										System.out.println("\n\t\t...Wrong value...");
										L4i4i:do{	
											System.out.print("\n\t\tDo you want to input correct value again (Y/N) : ");
											char op=input.next().charAt(0);
											if(op=='n'|| op=='N'){
												break L4;
											}else if(op=='y'||op=='Y'){
												do{	
												continue L4i4i;
												}while(true);
											}else{
												System.out.println("\n\t\tWrong option.. input correct...\n");
												continue L4i4i;
											}
										}while(true);
									}
								L4i:do{
									System.out.print("\t\tDo you want to calculate another SSCL tax (Y/N) : ");
														char op=input.next().charAt(0);
														if(op=='n'|| op=='N'){
															break L4;
														}else if(op=='y'||op=='Y'){
															continue L4;
														}else{
															System.out.println("\n\t\tWrong option.. input correct...\n");
															continue L4i;
														}
								}while(true);
							}while(true);
						}while(true);break;

				case 5 :L5:do{
							clearConsole();
							System.out.println("\n\t+---------------------------------------------------------+");
							System.out.println("\t|                     LEASING PAYMENT                     |");
							System.out.println("\t+---------------------------------------------------------+\n");
							System.out.println("\t\t[1] Calculate Monthly Installment");
							System.out.println("\t\t[2] Search Leasing Category");
							System.out.println("\t\t[3] Find leasing amount");
							System.out.println("\t\t[4] Exit\n");
							

							System.out.print("\t\tEnter an option to continue -->");
							int num3=input.nextInt();

							

							switch(num3){
								case 1 :L5i:do{
											clearConsole();
											System.out.println("\n\t+---------------------------------------------------------+");
											System.out.println("\t|             Calculate Monthly Installment               |");
											System.out.println("\t+---------------------------------------------------------+");

											L5i1i:do{
												System.out.print("\n\t\tEnter lease amount           : ");
												double g=input.nextDouble();

												
													if(g>0){
														L5i1i1i:do{
															System.out.print("\t\tEnter annuval interest rate  : ");
															double h=input.nextDouble();

																if(h>0){	
																	L5i1i1i1i:do{
																			
																			System.out.print("\t\tEnter number of years         : ");
																			double j=input.nextDouble();
																			
																			if(j>0 & j<=5){
																			double monins,i,n,x,k;
																				i=h/1200;
																				n=j*12;
																				k=1+i;
																				x=Math.pow(k,n);
																				monins= g*i / ( 1 - (1 / x));
																				
																				System.out.printf("\t\tYour monthly Installment : %.2f\n\n",monins);
																			
																				L5i1i1i1i1i:do{
																					
																					System.out.print("\t\tDo you want to calculate another Monthly Installment (Y/N) : ");
																					char op=input.next().charAt(0);
																						if(op=='n'|| op=='N'){
																							break L5i;
																						}else if(op=='y'||op=='Y'){
																							do{
																							clearConsole();		
																							continue L5i;
																							}while(true);
																						}else{
																							System.out.println("\n\t\tWrong option.. input correct...\n");
																							continue L5i1i1i1i1i;
																						}
																				}while(true);
																				
																			}else{
																				L5i1iiii:do{
																					System.out.print("\n\t\tInvalid number of years...Do you want to input correct number of years again ? (Y/N) : ");
																					char op=input.next().charAt(0);
																					if(op=='n'|| op=='N'){
																						break L5i;
																					}else if(op=='y'||op=='Y'){
																						do{
																						continue L5i;
																						}while(true);
																					}else{
																						System.out.println("\n\t\tWrong option.. input correct...\n");
																						do{
																						continue L5i1iiii;
																						}while(true);
																					}
																				}while(true);
																			
																			}
																	}while(true);
																}else{
																	System.out.println("\n\t\t...Wrong Annual Interest Rate...\n");
																	L5i1i1i1ii:do{
																		System.out.print("\n\t\tDo you want to input correct Annual Interest Rate again (Y/N) : ");
																				char op=input.next().charAt(0);
																				if(op=='n'|| op=='N'){
																					break L5i;
																				}else if(op=='y'||op=='Y'){
																					do{
																					continue L5i;
																					}while(true);
																				}else{
																					System.out.println("\n\t\tWrong option.. input correct...\n");
																					do{
																					continue L5i1i1i1ii;
																					}while(true);
																				}
																	}while(true);
																}
														}while(true);
													}else{
														System.out.println("\n\t\t...Wrong lease amount value...\n");
														L5i1i1ii:do{
															
															System.out.print("\n\t\tDo you want to input correct lease amount value again (Y/N) : ");
																char op=input.next().charAt(0);
																if(op=='n'|| op=='N'){
																	break L5i;
																}else if(op=='y'||op=='Y'){
																	do{
																	continue L5i;
																	}while(true);
																}else{
																	System.out.println("\n\t\tWrong option.. input correct...\n");
																	do{
																	continue L5i1i1ii;
																	}while(true);
																}
														}while(true);
													}	
												
											}while(true);
										}while(true);break;

								case 2 :L5ii:do{
											clearConsole();
											System.out.println("\t+---------------------------------------------------------+");
											System.out.println("\t|                  Search leasing Category                |");
											System.out.println("\t+---------------------------------------------------------+");
											do{
												System.out.print("\n\t\tEnter annuval interest rate  : ");
												double h1=input.nextDouble();

												if(h1>0){
													do{
														System.out.print("\t\tEnter lease amount           : ");
														double g1=input.nextDouble();

														if(g1>0){
															do{
																double monins1,monins2,monins3,i1,n1,n2,n3,x1,x2,x3,k1;
																i1=h1/1200;
																n1=3*12;
																n2=4*12;
																n3=5*12;
																k1=1+i1;
																x1=Math.pow(k1,n1);
																x2=Math.pow(k1,n2);
																x3=Math.pow(k1,n3);
																monins1= g1*i1 / ( 1 - (1 / x1));
																monins2= g1*i1 / ( 1 - (1 / x2));
																monins3= g1*i1 / ( 1 - (1 / x3));
																System.out.printf("\n\t\tYour monthly Installment for 3 year leasing plan :  %.2f\n",monins1);
																System.out.printf("\t\tYour monthly Installment for 4 year leasing plan :  %.2f\n",monins2);
																System.out.printf("\t\tYour monthly Installment for 5 year leasing plan :  %.2f\n",monins3);
																	
																L5ii2i2i2i:do{
																	System.out.print("\n\t\tDo you want to calculate another Leasing catagory (Y/N) : ");
																		char op=input.next().charAt(0);
																		if(op=='n'|| op=='N'){
																			break L5ii;
																		}else if(op=='y'||op=='Y'){
																			continue L5ii;
																		}else{
																			System.out.println("\n\t\tWrong option.. input correct...\n");
																			continue L5ii2i2i2i;
																		}
																}while(true);
															}while(true);
														}else{
															System.out.println("\n\t\t...Wrong Lease amount...\n");
															L5ii2i2i:do{
															
																System.out.print("\n\t\tDo you want to input correct Lease amount value again (Y/N) : ");
																	char op=input.next().charAt(0);
																	if(op=='n'|| op=='N'){
																		break L5ii;
																	}else if(op=='y'||op=='Y'){
																		do{
																		continue L5ii;
																		}while(true);
																	}else{
																		System.out.println("\n\t\tWrong option.. input correct...\n");
																		do{
																		continue L5ii2i2i;
																		}while(true);
																	}
															}while(true);
														}
													}while(true);
												}else{
													System.out.println("\n\t\t...Wrong Annual Interest Rate...\n");
													L5ii2i:do{
															
														System.out.print("\n\t\tDo you want to input correct Annual Interest Rate again (Y/N) : ");
															char op=input.next().charAt(0);
															if(op=='n'|| op=='N'){
																break L5ii;
															}else if(op=='y'||op=='Y'){
																do{
																continue L5ii;
																}while(true);
															}else{
																System.out.println("\n\t\tWrong option.. input correct...\n");
																do{
																continue L5ii2i;
																}while(true);
															}
													}while(true);
												}
											}while(true);
										}while(true);break;

								case 3 :L5iii:do{
											clearConsole();
											System.out.println("\t+-------------------------------------------------------------------------------+");
											System.out.println("\t|                               Find leasing Amount                             |");
											System.out.println("\t+-------------------------------------------------------------------------------+\n");

											do{
												System.out.print("\n\t\tEnter the monthly lease payment amount you can afford : ");
												double l=input.nextDouble();

												if(l>0){
													do{
														System.out.print("\t\tEnter annuval interest rate  : ");
														double m=input.nextDouble();

														if(m>0){
															do{
																System.out.print("\t\tEnter number of years         : ");
																double p=input.nextDouble();

																if(p>0){
																	double leaseamount,i2,n4,k2,y;
																	i2=m/1200;
																	n4=p*12;
																	k2=1+i2;
																	y=Math.pow(k2,n4);
																	leaseamount=(l*( 1 - (1 / y)))/i2;
																	System.out.printf("\t\tYou can get lease amount  :  %.2f\n",leaseamount);

																	L5iii3i3i3i3i:do{
																			System.out.print("\n\t\tDo you want to calculate another Leasing amount (Y/N) : ");
																				char op=input.next().charAt(0);
																				if(op=='n'|| op=='N'){
																					break L5iii;
																				}else if(op=='y'||op=='Y'){
																					continue L5iii;
																				}else{
																					System.out.println("\n\t\t...Wrong option...\n");
																					continue L5iii3i3i3i3i;
																				}
																	}while(true);
																}else{
																	System.out.println("\n\t\t...Wrong number of years...");
																	L5iii3i3i3i:do{
																			
																		System.out.print("\n\t\tDo you want to input correct number of years again (Y/N) : ");
																			char op=input.next().charAt(0);
																			if(op=='n'|| op=='N'){
																				break L5iii;
																			}else if(op=='y'||op=='Y'){
																				do{	
																				continue L5iii;
																				}while(true);
																			}else{
																				System.out.println("\n\t\tWrong option.. input correct...\n");
																				do{
																				continue L5iii3i3i3i;
																				}while(true);
																			}
																	}while(true);
																}
															}while(true);
														}else{
															System.out.println("\n\t\t...Wrong Annual Interest Rate...");
															L5iii3i3i:do{
																	
																System.out.print("\n\t\tDo you want to input correct Annual Interest Rate again (Y/N) : ");
																	char op=input.next().charAt(0);
																	if(op=='n'|| op=='N'){
																		break L5iii;
																	}else if(op=='y'||op=='Y'){
																		do{	
																		continue L5iii;
																		}while(true);
																	}else{
																		System.out.println("\n\t\tWrong option.. input correct...\n");
																		do{
																		continue L5iii3i3i;
																		}while(true);
																	}
															}while(true);
														}
													}while(true);
												}else{
													System.out.println("\n\t\t...Wrong monthly lease payment amount you can afford...");
													L5iii3i:do{
															
														System.out.print("\n\tDo you want to input, correct monthly lease payment amount you can afford again (Y/N) : ");
															char op=input.next().charAt(0);
															if(op=='n'|| op=='N'){
																break L5iii;
															}else if(op=='y'||op=='Y'){
																do{
																clearConsole();	
																continue L5iii;
																}while(true);
															}else{
																System.out.println("\n\t\tWrong option.. input correct...\n");
																do{
																continue L5iii3i;
																}while(true);
															}
													}while(true);
												}
											}while(true);
										}while(true);break;
								case 4 :break L5;
								default:System.out.println("\n\t\t...Wrong number...");
											L6:do{
																		
												System.out.print("\n\t\tDo you want to input correct number again (Y/N) : ");
													char op=input.next().charAt(0);
													if(op=='n'|| op=='N'){
														break L5;
													}else if(op=='y'||op=='Y'){
														do{
														clearConsole();	
														continue L5;
														}while(true);
													}else{
														System.out.println("\n\t\tWrong option.. input correct...\n");
														do{
														continue L6;
														}while(true);
													}
											}while(true);
							}
						}while(true);break;

				case 6 :break L0;
				default: System.out.println("\n\t\t...Wrong Number...");
							L7:do{
																					
								System.out.print("\n\t\tDo you want to input correct number again (Y/N) : ");
									char op=input.next().charAt(0);
									if(op=='n'|| op=='N'){
										break L0;
									}else if(op=='y'||op=='Y'){
										do{
										clearConsole();	
										continue L0;
										}while(true);
									}else{
										System.out.println("\n\t\tWrong option.. input correct...\n");
										do{
										continue L7;
										}while(true);
									}
							}while(true);
							
			} 
		}while(true);
	
	
	}

	public final static void clearConsole() {
		try {
		final String os = System.getProperty("os.name");
		if (os.contains("Windows")) {
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		} else {
		System.out.print("\033[H\033[2J");
		System.out.flush();
		}
		} catch (final Exception e) {
		e.printStackTrace();
			// Handle any exceptions.
		}
	}

}

