import java.util.*;
import java.math.*;
import java.io.*;

public class A2011_ProblemSolving {	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		while(testCase-- > 0) {
			int problems = scanner.nextInt();
			int[] difficult = new int[problems];
			int solve = 0;
			for(int i = 0; i < difficult.length; i++) {
				difficult[i] = scanner.nextInt();
				if(difficult[i] < problems) {
					solve++;
				}
				else {
					break;
				}
			}
			if(solve > 0) {
				System.out.println(solve);
			}
			else {
				System.out.println("Ambiguous");
			}
		}
		scanner.close();
	}
}

// Assembly
/**
section .data
    msg_ambiguous db "Ambiguous", 0
    msg_solve db "%d", 10, 0

section .bss
    difficult resd 100  ; Assuming a maximum of 100 problems
    testCase resd 1
    problems resd 1
    solve resd 1
    i resd 1

section .text
    extern printf, scanf
    global main

main:
    ; Initialize the scanner
    push testCase
    push problems
    push solve
    push i

    ; Read number of test cases
    push testCase
    push msg_solve
    call scanf
    add esp, 8

test_case_loop:
    ; Decrement testCase
    mov eax, [testCase]
    dec eax
    mov [testCase], eax
    test eax, eax
    jle end_program

    ; Read number of problems
    push problems
    push msg_solve
    call scanf
    add esp, 8

    ; Initialize solve to 0
    mov dword [solve], 0

    ; Loop through problems
    mov dword [i], 0

problem_loop:
    mov eax, [i]
    cmp eax, [problems]
    jge end_problem_loop

    ; Read difficulty
    push difficult
    add difficult, eax
    push msg_solve
    call scanf
    add esp, 8

    ; Check if difficulty < problems
    cmp dword [difficult + eax*4], [problems]
    jl increment_solve

    ; Break if not less
    jmp end_problem_loop

increment_solve:
    ; Increment solve
    inc dword [solve]

end_problem_loop:
    ; Increment i
    inc dword [i]
    jmp problem_loop

    ; Check solve
    mov eax, [solve]
    cmp eax, 0
    jg print_solve

    ; Print "Ambiguous"
    push msg_ambiguous
    call printf
    add esp, 4
    jmp test_case_loop

print_solve:
    push eax
    push msg_solve
    call printf
    add esp, 8

    jmp test_case_loop

end_program:
    ; Exit program
    ret
*/