package solution

// you can also use imports, for example:
// import "fmt"
// import "os"

// you can write to stdout for debugging purposes, e.g.
// fmt.Println("this is a debug message")

import (
	"strconv"
)

func Solution(N int) int {
	binary := strconv.FormatInt(int64(N), 2)
	maxGap := 0
	currentGap := 0
	for _, char := range binary {
		if char == '0' {
			currentGap++
		} else {
			if currentGap > maxGap {
				maxGap = currentGap
			}
			currentGap = 0
		}
	}
	return maxGap
}
