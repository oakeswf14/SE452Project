insert into screeners (description)
values ('test description for first screener');

insert into screeners (description)
values ('test description for second screener');

insert into questions (screener_id, prompt, answer_type)
values (
	1,
	'first test question for first screener',
	'STRING'
);

insert into questions (screener_id, prompt, answer_type)
values (
	1,
	'second test question for first screener',
	'NUMBER'
);

insert into questions (screener_id, prompt, answer_type)
values (
	2,
	'first test question for first screener',
	'SINGLE_SELECT'
);

insert into questions (screener_id, prompt, answer_type)
values (
	2,
	'second test question for first screener',
	'MULTI_SELECT'
);