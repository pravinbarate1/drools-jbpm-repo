# drools-jbpm-repo


rafaeltuelho notes for rhpam
https://gist.github.com/rafaeltuelho/eb3a92057208b1053609ea6d06c28352


Donato Marazzo
https://github.com/dmarrazzo/rh-bpm-notes


* For logging in the node
org.slf4j.Logger logger = null;
logger = org.slf4j.LoggerFactory.getLogger(kcontext.getProcessInstance().getProcessName()+"|"+kcontext.getNodeInstance().getNodeName()+"|"+kcontext.getProcessInstance().getId());

logger.info("################################ Log Statement ##########################");

