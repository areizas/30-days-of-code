package main

import (
	"fmt"
)

type person struct {
	age int
}

func (p person) NewPerson(initialAge int) person {
	if initialAge<0 {
		p.age = 0
		fmt.Println("Age is not valid, setting age to 0.")
	}
	return p
}

func (p person) yearPasses() person {
	p.age+=1
	return p
}

func (p person) amIOld() {
	if p.age<13 {
		fmt.Println("You are young.")
	} else if p.age<18 {
		fmt.Println("You are a teenager.")
	} else {
		fmt.Println("You are old.")
	}
}

func main()  {
	ages := [4]int{-1,10,16,18}

	for i:=0; i<4; i++{
		p := person{age:ages[i]}
		p = p.NewPerson(ages[i])
		p.amIOld()
		for j:=0;j<3;j++{
			p = p.yearPasses()
		}
		p.amIOld()
		fmt.Println("")
	}

}