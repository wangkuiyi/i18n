package main

import (
	"fmt"
	"unicode"
)

func main() {
	s := "ألسّلام عليكمনমস্কার 你好世界 Hello World"
	for _, c := range s {
		for n, s := range unicode.Scripts {
			if unicode.In(c, s) {
				fmt.Printf("%c is %s\n", c, n)
			}
		}
	}
}
