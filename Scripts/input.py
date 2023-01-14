"""
input.py - It is the script which locates the dataset and transforms it into the format required by the model to serve
as an input
"""

import os
import pandas as pd
import re

CODECHEF_DATA_PATH = ".\\data\\codechef"
CODECHEF_PROMPTS_FILE_NAMES = "description.txt"


def get_paths():
    input_files_paths = []
    for path, subdirs, files in os.walk(CODECHEF_DATA_PATH):
        for name in files:
            if name == CODECHEF_PROMPTS_FILE_NAMES:
                input_files_paths.append(os.path.join(path, name))
    return input_files_paths


def read_codechef_data():
    files = get_paths()
    data = []
    prompt_id = 0
    for file in files:
        prompt_id += 1
        with open(file, encoding="utf-8") as problem:
            prompt = problem.read()
        data.append([prompt_id, file, prompt])
    data_ = pd.DataFrame(data, columns=["task_id", "path", "prompt"])
    return data_


def add_arguments(questions_dataframe):

    inputs = []
    for index, row in questions_dataframe.iterrows():
        sample_input = ""
        with open(row["path"], encoding="UTF-8") as infile:
            copy = False
            for line in infile:
                if line.strip() == "Input:":
                    copy = True
                    continue
                elif line.strip() == "Output:":
                    copy = False
                    continue
                elif copy:
                    sample_input = sample_input + line

        inputs.append(sample_input)

    outputs = []
    for index, row in questions_dataframe.iterrows():
        sample_output = ""
        with open(row["path"], encoding="UTF-8") as infile:
            copy = False
            for line in infile:
                if line.strip() == "Output:":
                    copy = True
                    continue
                elif line.strip() == "Explanation:" or "Explanation" in line.split() or "Explanation:" in  line.split():
                    copy = False
                    continue
                elif copy:
                    sample_output = sample_output + line

        outputs.append(sample_output)

    return inputs, outputs


def read_prompts():
    codechef_data = read_codechef_data()
    example_inputs, example_outputs = add_arguments(codechef_data)
    codechef_data["sample_input"] = example_inputs
    codechef_data["sample_output"] = example_outputs
    return codechef_data
