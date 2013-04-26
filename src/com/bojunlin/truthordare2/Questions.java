package com.bojunlin.truthordare2;

import java.util.Random;

public class Questions {
	//========================Show the questions========================================
	
		 public String showMessage(int n)    //must be a String if you need to return a string
		{
		    String display;
			Random generator = new Random();
			int randomIndex = 0, X = 0;
			int randomIndex2 = generator.nextInt(100);
			int randomIndex3 = generator.nextInt(100);
			int randomIndex4 = generator.nextInt(200);
		    int randomIndex5 = generator.nextInt(200);
		
			switch(n)
			{  
			  case 1: randomIndex = generator.nextInt(41);break;
			  case 2: randomIndex = generator.nextInt(41);X = 40;break;
			  case 3: randomIndex = generator.nextInt(81);break;
			  default: break;
			}
		    
		   
			switch(randomIndex + X)
			{
			//Truths
			case 1: display="T1. How long is your penis (for guys) or what is your bra size (for girls)?"; break;
			case 2: display="T2. Have you ever touched another guy's penis (or vagina, ass, or girls' chest) or yours be touched? If so, give the group details: What is the thing being touched? Who was it? Why?"; break;
			case 3: display="T3. Have you ever laughed loudly in a group of people and be mocked at by the people around you? Give the details "; break;
			case 4: display="T4. Have you ever farted in a group of people and noticed by them? Give the details. How did you deal with it?" ; break; 
			case 5: display="T5. (Girls) Have you ever fingered yourself? "; break;
			case 6: display="T6. Have you ever kissed by a person(not include your father or mother or relatives) of the same sex? Give the details"; break;
			case 7: display="T7. What is the shortest length of time between different sex partners you know or you guess? "; break;
			case 8: display="T8. Have you ever saw naked body of a person (different sex from you, real person, not in video)? Give the details"; break;
			case 9: display="T9. Have you ever stolen other's money or things? Give the details, who, when, why? "; break;
			case 10: display="T10. Have you ever hated or envied some one in this group? Who? why? "; break;
			case 11: display="T11. Who in this group do you think cheat most in the exams? Why? "; break;
			case 12: display="T12. Have you ever thrown rubbish in your friends' or classmates' pocket? Details? Why?"; break;
			case 13: display="T13. Who is your favorite deskmate(different sex from you), say a most romantic story between you two "; break;
			case 14: display="T14. Have you ever written love poems or letters? If so, say it to a boy or girl(different sex from you); If not, create one right now and do the same thing "; break;
			case 15: display="T15. Have you ever fallen in love with more than one guy during a same period? Who, when, why? "; break;
			case 16: display="T16. Who was the guy you love most? Who in this group do you think like him/her most?If there is no one suitable in this group, describe the one that suits "; break;
			case 17: display="T17. Have you ever been followed by someone or followed others? Who, when, why? "; break;
			case 18: display="T18. What is your favorite sexual position? Who did you do it with? Why do you like it? "; break;
			case 19: display="T19. What is your least favorite kind of person, why? "; break;
			case 20: display="T20. What is the most uncomfortable place you have ever studied in? If so, give the group details. If not, you must be a study god. "; break;
			case 21: display="T21. Have you been caught while you are cheating in an exam? Give the details"; break;
			case 22: display="T22. Have you ever fallen in love with a girl or a boy that is not real? "; break;
			case 23: display="T23. Who was the girl/boy you fell in love with? Who? How old were you? "; break;
			case 24: display="T24. (Guys) How old when you had your first wet dream? "; break;
			case 25: display="T25. Have you tried not wearing underwares and go out? Give the details"; break;
			case 26: display="T26. (Guys) Describe the perfect girl for sex? How big are her boobs? Is she shaved? How tight should she be? Does she swallow?" +
					"              (Girls) Describe the perfect guy for sex? How big are his biceps? How long/wide is his penis? Does he swallow? Is he there in the case morning? "; break;
			case 27: display="T27. Who are you pursuing or planning to pursue? What do you plan to do? If there is no one, say how you pursured a girl or been pursued."; break;
			case 28: display="T28. Have you ever fallen in love with someone and not known their name? Give the details"; break;
			case 29: display="T29. Say your most romantic time "; break;
			case 30: display="T30. How many people in this group do you think have sexual experiences? Who? "; break;
			case 31: display="T31. Say an experience that you were bullied."; break;
			case 32: display="T32. Which one of the people playing the game do you think has the longest penis? "; break;
			case 33: display="T33. Which one of the people here do you think eats most? Why?"; break;
			case 34: display="T34. Which one of the people playing the game do you think will be the last one to get married? Why?"; break;
			case 35: display="T35. Which one of the people playing the game you like most? If he or she likes you, would you break up with your girlfriend/boyfriend?"; break;
			case 36: display="T36. Of the people playing the game, who do you think has the most partners that have subtle relationship with him or her? "; break;
			case 37: display="T37. Of the people playing the game, who do you think will lost their virginity first? last? Why? "; break;
			case 38: display="T38. Who in this group do you think is the most mentally fragile guy? Why"; break;
			case 39: display="T39. What have you inserted in your vagina (Girls)? Finger? Cucumber? What have you stuck your dick inside of (Guys)? Holes? Apple Pie? Jell-O?"; break;
			case 40: display="T40. Not counting your current boyfriend/girlfriend, which person playing the game would you most like to have sex with?"; break;
		
			//Dares
			case 41: display="D1. Put on a blindfold and dance alone crazily for 30s. "; break;
			case 42: display="D2. Chew a paper for 30s, show the result to the group when you finished."; break;
			case 43: display="D3. Mimic the behavior of a person for 5 minutes. "; break;
			case 44: display="D4. Laugh (sometimes loudly, sometimes quietly) in a very silly way for 30s."; break;
			case 45: display="D5. Go to the bathroom and change, you must 'go commando' for the rest of the game."; break;
			case 46: display="D6. Touch your nose with your tongue. If you are unable to do this you must touch another players nose with your tongue."; break;
			case 47: display="D7. Go outside and run around, while screaming '我是哑巴！哈哈！我就是个哑巴！！'."; break;
			case 48: display="D8. Cry loudly for 30s while standing on the desk with 1 foot."; break;
			case 49: display="D9. Give a piggyback ride to a heaviest person in this group. If you cannot do it, kiss your sock for 30s."; break;
			case 50: display="D10. Call one person at random who you know and knows you ask them, seriously 'When a cow laughs, does milk come out it's nose?'(say it in your mother tongue!)"; break;
			case 51: display="D11. Put an ice cube in your underwear and keep it there until it completely melts."; break;
			case 52: display="D12. Clap with one of your hand and one of your foot for 30s, then lick that hand."; break;
			case 53: display="D13. Put lipstick on another player(different sex) but you are not allowed to use your hands."; break;
			case 54: display="D14. Get on all four and howl and bark at another player anytime they move or speak for the next 3 rounds(or 5 minutes)."; break;
			case 55: display="D15. Have another player select a food from the kitchen for you to eat without the uses of your hands. (The messier the better.)"; break;
			case 56: display="D16. Act what you behave when you are giving a shit (but you feel it is very hard to get it out) for 30s."; break;
			case 57: display="D17. Facing the group, pointing your finger to your nose and shaking your head while yelling something which is decided by other players."; break;
			case 58: display="D18. Crying and Begging others to choose another question for you. You need to answer the next question. If you meet this question again, congratulations."; break;
			case 59: display="D19. Crawling on the ground, approaching the one who is the most quiet and scare him or her away. Doing this for 30s"; break;
			case 60: display="D20. Go to the toilet and sing a song picked by other players."; break;
			case 61: display="D21. Put on a blindfold and feel another players face, see if you can guess who it is buy touch alone."; break;
			case 62: display="D22. Take a big item of food from the refrigerator and put it inside your pants(it must looks noticable) for 10 minutes."; break;
			case 63: display="D23. Select another player and repeat everything they say for the next 3 rounds(or 10 minutes)."; break;
			case 64: display="D24. Pick your nose and show the results to the group"; break;
			case 65: display="D25. It is time to test your luck! Choose another question, answer all the Truth questions until you get a Dare question. But you don't need to do anything if it is a dare question."; break;
			case 66: display="D26. Tuck in your shirt and drop an ice cube down your front. You must then perform a break dance until the ice cube shakes out or melts."; break;
			case 67: display="D27. Take off your shoe and suck on one of your toes. If you are unable to suck on your own toe you must suck on another players toe."; break;
			case 68: display="D28. All other players say a short word in sequence, you must remember them and say them out correctly, if you make a mistake, choose another question"; break;
			case 69: display="D29. Create a story with the words given by other players(everyone say one word)"; break;
			case 70: display="D30. Other players describe how every part of a man looks like (ex. the eye is like a cow), and you draw this man. If you laughed when you are drawing, answer another question"; break;
			case 71: display="D31. Laugh and cry alternately, each one you should perform for 5s. Do this for 1 minutes in total."; break;
			case 72: display="D32. Act like a monkey and try to grab anything on other players' hands in the next 3 rounds (or 5 minutes)"; break;
			case 73: display="D33. You need to bark: " +randomIndex2+" (this is a random number)\ntimes if this number is an odd number; If it is not, look into another player's eye quietly for 5 seconds and suddenly laugh in a silly way"; break;
			case 74: display="D34. Find a picture of a beautiful girl(for boys) or a handsome boy (for girls) and act like you love them madly."; break;
			case 75: display="D35. Sit on the desk to play whatever you are playing in the next 3 rounds (or 10 minutes)."; break;
			case 76: display="D36. Act like a girl (for boys) or man (girls) in the next 3 rounds (or 10 minutes), you must perform well until other players satisfy."; break;
			case 77: display="D37. Show your tongue to every player, closely and face to face."; break;
			case 78: display="D38. Draw a pig or turtle on your face (make it noticable) for the rest of the game."; break;
			case 79: display="D39. Change your coat and pants, make them inside out for the rest of the game."; break;
			case 80: display="D40. :) Would you like to test your luck? Below is a caculation consists of two random nubmers:\n" + randomIndex2 + "+" + randomIndex3 + "\nIf the result is greater than another random sum below: \n"
					        + randomIndex4 + "+" + randomIndex5 + "\nYou pass. But if it is not (equal or less), you need to suck your finger for 30s and answer one Truth question and one Dare question."; break;
			
			
			default:display="不错呀！甩出全中文了！！！那就请随便背诵李白的一首诗再翻译成英文吧！"; break;
			}
			
			return display;
		}
}
