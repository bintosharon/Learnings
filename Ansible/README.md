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







