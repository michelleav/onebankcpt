CREATE TABLE if not exists transfer (
    id int,
    senderIBAN varchar2(150),
    receiverIBAN varchar2(150),
    amount double,
    creationDate date
);

CREATE TABLE if not exists transfer_history (
    id int,
    senderFirstName varchar2(100),
    senderLastName varchar2(100),
    senderAddress varchar2(150),
    senderIBAN varchar2(150),
    receiverFirstName varchar2(100),
    receiverLastName varchar2(100),
    receiverAddress varchar2(150),
    receiverIBAN varchar2(150),
    amount double,
    creationDate date
);

CREATE TABLE if not exists account (
    id int,
    firstName varchar2(100),
    lastName varchar2(100),
    address varchar2(150),
    IBAN varchar2(150),
    currency varchar2(3),
    balance double,
    creationDate date
);