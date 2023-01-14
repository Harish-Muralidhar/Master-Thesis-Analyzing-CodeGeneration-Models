"""
MASTER THESIS : BENCHMARK TEST TO ANALYSE PERFORMANCE OF CODE GENERATING FOUNDATION MODELS

main.py - This is the main file to be run to execute the project. It is connected to various other scripts to fetch
dataset, transform data, feed input to model, gather results and analyse the performance
"""

from model import run_model
from input import read_prompts
import os
import time

EMPTY_STRING = ""
PYTHON_CODECHEF_RESPONSE_PATH = ".\\generated_codes\\python\\codechef_responses"
JAVA_CODECHEF_RESPONSE_PATH = ".\\generated_codes\\java"
PYTHON_QUESTION_DEFAULT_INSTRUCTION = "Write a python code for the following question.\nImport the necessary " \
                                      "libraries.\n"
JAVA_QUESTION_DEFAULT_INSTRUCTION = "Write a Java code for the following question.\nImport the necessary " \
                                      "libraries.\n"
COMPLETE_RESPONSES_PATH = ".\\complete_responses"
EXTENSION_PYTHON = ".py"
EXTENSION_JAVA = ".java"
COUNT = -1


def parse_result(codex_output):
    if 'choices' in codex_output:
        x = codex_output['choices']
        if len(x) > 0:
            print("Code generated Successfully")
            # print(x[0]['text'])
            return x[0]['text']
        else:
            return ''
    else:
        return ''


def save_responses(file_save_path, content):
    if '\'\'\'' in content:
        content = f"'''\n{content}"
    elif "\"\"\"" in content:
        content = f'"""\n{content}'
    elif '*/' in content:
        content = f'/*\n{content}'
    print("Saving code as .java file")
    with open(file_save_path, "w", encoding="UTF-8") as java_file:
        java_file.write(content)
    print("File saved successfully.")
    print("waiting....")
    time.sleep(80)
    print("wait time over\n\n")


print("Reading Questions")
codechef_dataframe = read_prompts()
codechef_dataframe["generated_code"] = EMPTY_STRING

for codechef_index, codechef_row in codechef_dataframe.iterrows():
    if codechef_index > COUNT:
        print("Generating Code for Question", codechef_index)
        codechef_prompt = codechef_row["prompt"]
        # codechef_question = f"{PYTHON_QUESTION_DEFAULT_INSTRUCTION}{codechef_prompt}"
        codechef_question = f"{JAVA_QUESTION_DEFAULT_INSTRUCTION}{codechef_prompt}"
        codechef_result = run_model(codechef_question)
        # with open(os.path.join(COMPLETE_RESPONSES_PATH, f"{codechef_index}.txt"), 'w') as text_file:
        #    text_file.write(str(codechef_result))
        model_generated_code = parse_result(codechef_result)
        codechef_dataframe.at[codechef_index, 'prompt'] = codechef_question
        codechef_dataframe.at[codechef_index, 'generated_code'] = model_generated_code
        filename = f"{codechef_index}{EXTENSION_JAVA}"
        save_responses(os.path.join(JAVA_CODECHEF_RESPONSE_PATH, filename), model_generated_code)
    else:
        continue


# codechef_dataframe.to_excel("codex_results_for_codechef_data_python.xlsx")
codechef_dataframe.to_excel("codex_results_for_codechef_data_java.xlsx")


