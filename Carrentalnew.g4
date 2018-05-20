/**
 * Define a grammar called Hello
 */
grammar Carrentalnew;

sbvr : pola;
pola: obligasi
	 |kalimatifelse;

obligasi: modalobligasi statement #obligasi_1|
		  modalobligasi statement iftoken statement #obligasi_2|
		  //mustStatement #obligasi_3|
		  statement modalobligasi statement #obligasi_4;
		  
kalimatifelse: iftoken statement thentoken obligasi #ifthenelse_1
			  |iftoken statement thentoken statement #ifthenelse_2;

modalobligasi: obligationoperator=('it is obligatory that' | 'it is prohibited that' | 'it is impossible that');
statement: quantification term verb quantification term #pola_statement_1
		  |term identifier verb term   #pola_statement_2
		  |term verb term verb term #pola_statement_3
		  |term verb term #pola_statement_4
		  |term ((disjunction|conjunction) term)* #pola_statement_5;
/*
quantification : keywordQuantification=('each'|'some'|'at least one'|'at least ' INT
					| 'at most one' | 'at most ' INT | 'exactly one'|'exactly ' INT
					| 'at least ' INT ' and at most ' INT| 'more than one'
);*/

numberedQuantification:  'at least ' INT | 'at most ' INT |'exactly ' INT
						|'at least ' INT ' and at most ' INT;

identifier: identifierType=('is' | 'is not');


quantification : keywordQuantification=('each'|'some'|'at least one'
					| 'at most one' | 'exactly one'
					| 'more than one'
);

iftoken: 'if'|'IF'|'If';
thentoken: 'then'|'THEN'|'Then';

disjunction: 'or'|'OR';
conjunction: 'and'|'AND';
term :  dt #term_type1
       |noun #term_type2
	   |dt keyword identifier verb term #term_type3;


dt: noun verb noun #pola_DT_1 
   |keyword identifier verb noun #pola_DT_2
   |noun keyword identifier verb noun #pola_DT_3;
noun: 'operating company' | 'insurer' | 'estimated rental price' | 'credit card'
				   |'renter'|'rental'|'open rental'|'price conversion'|'rental price'
				   |'currency';
verb : posessiveVerb=('has' | 'of' |'for')|
	   verbConcept=('provisionally charged to'| 'in the name of' | 'responsible for'
	   			   |'requests'|'converted to');

keyword : 'that' | 'who' | 'which';

INT : [0-9]+ | ['0'..'9']+;

ID : [a-z]+ ;             // match lower-case identifiers

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
ARTICLE: ( ' a '|' an '|' the '|' ') -> channel(HIDDEN);



