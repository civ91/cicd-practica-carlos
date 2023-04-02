#!/bin/bash

# Install Java
sudo apt update
sudo apt install -y default-jre

# Download and install Jenkins agent
wget https://<jenkins-url>/jnlpJars/agent.jar -P /home/ubuntu/agent
echo "[Unit]
Description=Jenkins Agent

[Service]
Type=simple
User=ubuntu
ExecStart=/usr/bin/java -jar /home/ubuntu/agent/agent.jar -jnlpUrl https://localhost:8080/computer/principal/slave-agent.jnlp 

[Install]
WantedBy=multi-user.target" > /etc/systemd/system/jenkins-agent.service

sudo systemctl daemon-reload
sudo systemctl enable jenkins-agent.service
sudo systemctl start jenkins-agent.service
