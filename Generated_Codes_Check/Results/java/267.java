/*
 */

package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

func main() {
	var a, b int
	fmt.Scan(&a)
	fmt.Scan(&b)

	scanner := bufio.NewScanner(os.Stdin)
	var o string

	for scanner.Scan() {
		o = scanner.Text()
		break
	}

	res := a - b
	resS := strconv.Itoa(res)
	resS = strings.Replace(resS, string(o[len(o)-1]), "", 1)
	fmt.Println(resS + o[len(o)-1])
}