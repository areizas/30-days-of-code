package main

import "fmt"

func main()  {
	var number int
	fmt.Print("Set a number to show its first 10 multiples: ")
	fmt.Scanln(&number)

	for i:=1; i<11; i++{
		fmt.Println(number,"x", i, "=", i*number)
	}
}
