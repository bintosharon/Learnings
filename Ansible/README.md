# Ansible for absolute Beginner - handson DevOps

## Why Ansible

  - sizing creating new hosts 
  - applying ocnfigrations
  - security and compliance audits

- ansible - IT automation tool
- powerful enough to automate complex deployment


- power up webservers first then database server
- 100s of VMs provision on amazon, setup app, communication, starting app, firewall rules
- data from CMDB data base, trigger automation automatically in service now when workflow is approved
- [Ansible documentation](https://docs.ansible.com/).


`shutdown now -r`

`sudo vi /etc/hostname`
`sudo vi /etc/hosts`

## Inventory File
- we dont need to install additional software in target machine to work with ansible(no configuration of agent in target system)
- simple ssh does greaet
- info about these target is stored in inventory
- dfault location - `/etc/ansible/hosts`

`web ansible_host=server1.company.com ansible_connection=ssh
db ansible_host=server2.company.com
mail ansible_host=server3.company.com
web2 ansible_host=server4.company.com`

### Inventory parameters
`ansible_host=  is a inventory parameter
ansible_connection - ssh/winrm/localhost
ansible_port - 22/5986
ansible_user - root/administrator
ansible_ssh_pass=Password  #for linux
ansible_password=password # for windows based machine`

- winrm - windows server
- ssh- linux server

- localhost ansible_connection=localhost

- ssh key based passwordless 
### Creating inventory and pinging to systems
- cat > inventory.txt
- target1 ansible_host=<ipadress> ansible_ssh_pass=osboxes.org
  
  `ansible target1 -m ping -i inventory.txt`


## YAML

### XML

'<Servers>
<Server>
<name>Server1</name> 
<owner>John</owner> 
<created>12232012</created> 
<status>active</status>
</Server>
</Servers>'

### JSON
{
'Servers: [
{ 
name: Server1,
owner: John,
created: 12232012,
status: active,
 }
]
}'

### YAML

'Servers:
   - name: Server1 
     owner: John
     created: 12232012 
     status: active'

- key value pair
- key : value
- fruit: Apple

### Array:

Fruits:
- orange
- apple
- bannana

### Dictionary:
Banana:
  calories
  fat:
  carbs:

grapes:
  calories: 105
  fat: 0.4
  carbs:

- Be mindful of spaces/indentation
- Fruits:
    - banana:
        calories:
        ddd
        xxx
     - apple: 
        calories:
        ddd
        xxx

- we can represent data of car in dictionary
  - with properties like : color, model-name,modelyear, transmission, 

for List: 
	we can use 

- Dictionary: are unordered,
- arrays/list: ordered   here orders matter.

- line beginning with # is comment


## Ansible Playbooks:

### simple ansible playbook
- run command1 on server1
- restaring server 1

#### Complex Ansible Playbook

- Deploy 50 VMs on Public Cloud

- Deploy 50 VMs on Private Cloud

- Provision Storage to all VMs

- Setup Network Configuration on Private VMs

- Setup Cluster Configuration

- Configure Web server on 20 Public VMs

- Configure DB server on 20 Private VMs

- Setup Loadbalancing between web server VMs Setup Monitoring components

- Install and Configure backup clients on VMs Update CMDB database with new VM Information

### playbook

- play : set of tasks to be run on hosts
- task: action to be performed on the host
  - execute a command
  
list of dictionaries
- name: play1
  hosts: localhost
  
- name: play 2

- ansible-doc -l

- execute ansible playbook: ansible-playbook <playbook name>
- `ansible-playbook --help`

### ansible command

- one off task: test connectivity between ansible controller and targets
-  `ansible target1 -m ping`
- `ansible all -a "/sbin/reboot"`
- `ansible all -m ping -i inventory.txt
#### not ideal usage

### ansible play book command
`vi playbook-pingtest.yaml
-
  name: test connectivity to target servers
  hosts: all
  tasks:
    - name: ping test
      ping:`

- `ansible-playbook playbook-pingtest.yaml -i inventory.txt`












